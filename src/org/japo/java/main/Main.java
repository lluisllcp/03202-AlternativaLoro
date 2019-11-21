/* 
 * Copyright 2019 Lluís CP - aw.lluiscerda@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Lluís CP - aw.lluiscerda@gmail.com
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        //references

        final String NOMBRE_AMO = "Socrates";
        final String MSG_SI = "¡Ave César!";
        final String MSG_NO = "¡Sócrates Socorro!";

        //variables
        String nombrePersona, mensajeLoro;
        
        //mensaje
        System.out.println("Alternativa Loro");
        System.out.println("----------------");

        //Introduce la persona que se acerca
        System.out.printf("Persona que se acerca ..: ");
        nombrePersona = SCN.nextLine();
        System.out.println("---");

        //Analiza la persona que s aceraca
        if (nombrePersona.equals(NOMBRE_AMO)) {

            mensajeLoro = MSG_SI;

        } else {
            mensajeLoro = MSG_NO;

        }

        //Salida
        System.out.printf("Dueño del loro .........: %s%n", NOMBRE_AMO);
        System.out.println("---");
        System.out.println("Mensaje Loro ...........: " + mensajeLoro);

    }

}
