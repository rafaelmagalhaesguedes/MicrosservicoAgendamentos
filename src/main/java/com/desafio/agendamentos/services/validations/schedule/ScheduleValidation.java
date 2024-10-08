package com.desafio.agendamentos.services.validations.schedule;

import com.desafio.agendamentos.services.exceptions.SchedulingDateException;
import com.desafio.agendamentos.services.validations.schedule.impl.*;

import java.time.LocalDateTime;

public class ScheduleValidation {

    public static void validateScheduleDate(LocalDateTime dateSchedule) throws SchedulingDateException {
        var validator = new ScheduleValidator();

        // Adiciona as estratégias para validação
        validator.addStrategy(new PastDateValidation());
        validator.addStrategy(new OneHourAheadValidation());
        validator.addStrategy(new WorkingHoursValidation());
        validator.addStrategy(new SaturdayValidation());
        validator.addStrategy(new SundayValidation());

        // Valida as estratégias selecionadas
        validator.validate(dateSchedule);
    }
}