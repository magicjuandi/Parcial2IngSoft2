package org.example;

import org.example.domain.entities.*;
import org.example.services.appointmentServices.*;
import org.example.services.chatServices.*;
import org.example.services.chatServices.chatInterfaces.ChatService;
import org.example.services.ehrServices.*;
import org.example.services.ehrServices.ehrInterfaces.EHRService;
import org.example.services.fileServices.*;
import org.example.services.fileServices.fileInterfaces.FileService;
import org.example.services.notificationServices.*;
import org.example.services.notificationServices.notificationInterfaces.NotificationService;
import org.example.services.personaServices.*;
import org.example.services.personaServices.personaInterfaces.PersonaService;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // Ejemplo de uso de los microservicios

        // Creación de instancias de servicios
        PersonaService patientService = new PatientServiceImpl();
        PersonaService doctorService = new DoctorServiceImpl();
        FileService dataService = new DataServiceImpl();
        FileService fileService = new FileServiceImpl();
        ChatService chatService = new ChatServiceImpl();
        EHRService ehrService = new EHRServiceImpl();
        NotificationService appointmentNotificationService = new AppointmentNotificationServiceImpl();
        NotificationService reminderNotificationService = new ReminderNotificationServiceImpl();

        // Creación de algunos objetos para utilizar en los servicios
        Patient patient1 = new Patient();
        patient1.setId("P1");
        patient1.setName("Juan Perez");
        patient1.setDocument("123456");
        patient1.setCity("Ciudad de México");

        Doctor doctor1 = new Doctor();
        doctor1.setId("D1");
        doctor1.setName("Dr. López");
        doctor1.setDocument("789012");
        doctor1.setCity("Guadalajara");
        doctor1.setSpecialty("Cardiología");

        Data data1 = new Data();
        data1.setId("Data1");
        data1.setPatient(patient1);
        data1.setDoctor(doctor1);

        byte[] fileContent = {};
        File file1 = new File("File1", "NombreArchivo", fileContent, patient1, doctor1);

        Chat chat1 = new Chat();
        chat1.setId("Chat1");
        chat1.setPatient(patient1);
        chat1.setDoctor(doctor1);

        EHR ehr1 = new EHR();
        ehr1.setId("EHR1");
        ehr1.setPatient(patient1);
        ehr1.setDoctor(doctor1);

        AppointmentNotification appointmentNotification1 = new AppointmentNotification();
        appointmentNotification1.setId("AN1");
        appointmentNotification1.setRecipient("Paciente");
        appointmentNotification1.setMessage("Su cita ha sido programada para mañana");

        ReminderNotification reminderNotification1 = new ReminderNotification();
        reminderNotification1.setId("RN1");
        reminderNotification1.setPatient(patient1);
        reminderNotification1.setEhr(ehr1);

        // Uso de los servicios

        // Servicio de paciente
        patientService.create(patient1);
        List<?> patients = patientService.list();
        System.out.println("Patients: " + patients);

        // Servicio de doctor
        doctorService.create(doctor1);
        doctor1.setName("Dr. Pérez"); // Modificamos el nombre del doctor
        doctorService.update(doctor1);
        List<?> doctors = doctorService.list();
        System.out.println("Doctors: " + doctors);

        // Servicio de datos
        dataService.create(data1);
        List<?> datas = dataService.list();
        System.out.println("Datas: " + datas);

        // Servicio de archivos
        fileService.create(file1);
        List<?> files = fileService.list();
        System.out.println("Files: " + files);

        // Servicio de chat
        chatService.create(chat1);
        chatService.send("Hola, ¿cómo estás?");

        // Servicio de registros médicos electrónicos (EHR)
        ehrService.create(ehr1);
        List<EHR> ehrs = ehrService.list();
        System.out.println("EHRs: " + ehrs);

        // Servicio de notificación de cita
        appointmentNotificationService.create(appointmentNotification1);
        appointmentNotificationService.send(appointmentNotification1);

        // Servicio de notificación de recordatorio
        reminderNotificationService.create(reminderNotification1);
        reminderNotificationService.send(reminderNotification1);
    }
}
