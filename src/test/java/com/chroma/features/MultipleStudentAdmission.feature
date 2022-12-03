Feature: CTSMS - Adding multiple students

  @Progression
  Scenario Outline: As a Chroma Tech Faculty member I want to be able to add multiple students in one session
    Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
    When user logs with valid username "general@teacher.com" and password "123456"
    Then user is navigated to the dashboard page and sees text "Chroma Tech Academy"
    And clicks on the "Student Information" module
    And clicks on "Student Admission" submodule
    And enters "20989" in Admission No text box and "<Roll No>" in Roll Number text box
    And enters "<First Name>" in the First Name text box and "<Last Name>" in the Last Name text box
    And selects "<Class>" from the Class dropdown and "<Section>" from Section dropdown
    And selects "<Gender>" from the Gender dropdown
    And selects "Selenium" from the Category dropdown
    And enters "<Email>" in the Email text box
    And and selects "<Blood Group>" from the Blood Group dropdown
    And enters "<Date of Birth>" in Date of Birth
    And enters "<Admission Date>" in Admission Date
    And enters "<As on Date>" in As on Date
    And enters "<Mobile Number>" in "Mobile Number" and enters "<Height>" in "Height" and enters "<Weight>" in "Weight"
    And enters father info as "<Father Name>" in "Father Name" text box and "<Father Phone>" in "Father Phone" text box and "<Father Occupation>" in "Father Occupation" text box
    And enters mother info as "<Mother Name>" in "Mother Name" text box and "<Mother Phone>" in "Mother Phone" text box and "<Mother Occupation>" in "Mother Occupation" text box
    And navigates to If Gaurdian is and clicks on the radio button in front of "<Guardian>"
    And enters "<Guardian Email>" in Gaurdian Email text box and "<Guardian Address>" in the Gaurdian address text box
    And clicks Save
    Then student is admitted and "Record Saved Successfully" is displayed
    Then student record with name "<Student Name>" in Class "<Class>" in section "<Section>" is deleted through "Bulk Delete" submodule

    Examples: 
      | Roll No | First Name | Last Name          | Class          | Section                             | Gender | Email                  | Blood Group | Date of Birth | Admission Date | As on Date | Mobile Number | Height | Weight | Father Name            | Father Phone | Father Occupation         | Mother Name       | Mother Phone | Mother Occupation     | Guardian | Guardian Email        | Guardian Address                                | Student Name             |
      |     254 | Marlene    | Fisher             | SDET           | Database Testing                    | Female | MFisher@rotormail.com  | AB+         |    04/29/2005 |     11/15/2022 | 12/01/2022 |   37322020989 |   1.75 |     59 | Crile Fisher           |  37360302051 | Pediatrician              | Eugenia Insigna   |  37322235441 | Astronomer            | mother   | insigna@rotormail.com |                         18 Eclipse St, Rotor 05 | Marlene Fisher           |
      |     255 | Ana        | Barcari            | Cyber Security | Penetration Testing/Ethical Hacking | Female | AnaBarcari@yahoo.com   | B+          |    02/15/1999 |     11/16/2022 | 12/02/2022 |   16467712001 |   1.78 |     58 | Vitaliy Barcari        |  37370302072 | RE Agent                  | Elena Barcari     |  16463703020 | Chemical Engineer     | mother   | EBarcari@yahoo.com    |           47 W 13th St, New York, NY 10011, USA | Ana Barcari              |
      |     256 | Alex       | Dobinda            | SDET           | Database Testing                    | Male   | AlexDobinda@gmail.com  | A+          |    03/01/2000 |     11/17/2022 | 12/03/2022 |   17193960965 |   1.70 |     60 | Andrei Dobinda         |  16465512097 | Systems analyst           | Maria Dobinda     |  12124220577 | Marketing Coordinator | father   | dobinda@gmail.com     |             1 E 2nd St, New York, NY 10003, USA | Alex Dobinda             |
      |     257 | Dana       | Lupu               | SDET           | Database Testing                    | Female | danalupu@gmail.com     | O-          |    11/14/1998 |     11/18/2022 | 12/04/2022 |   12173258366 |   1.65 |     52 | Tudor Lupu             |  17194539624 | Dentist                   | Lidia Lupu        |  16467712411 | Medical Assistant     | father   | lupu@gmail.com        |        6 Walker Court, Fairfield, CT 06831, USA | Dana Lupu                |
      |     258 | Sandy      | Hallock            | SDET           | Database Testing                    | Male   | SHallock@gmail.com     | AB-         |    08/25/2003 |     11/19/2022 | 12/05/2022 |   16465542063 |   1.66 |     82 | Joe Hallock            |  16467717803 | Obstetrician              | Erin Hallock      |  18639147885 | Project Manager       | mother   | hallock@gmail.com     |       133 Macdougal St, New York, NY 10012, USA | Sandy Hallock            |
      |     259 | Brian      | Oneal              | Cyber Security | Penetration Testing/Ethical Hacking | Male   | BOneal@protonmail.com  | A+          |    06/11/2004 |     11/20/2022 | 12/06/2022 |   17193996560 |   1.72 |     71 | Bruce Oneal            |  19292178755 | Cardiologist              | Kate Oneal        |  12120577422 | Interior Designer     | father   | oneal@gmail.com       |          88 Morgan St, Jersey City NJ 07302 USA | Brian Oneal              |
      |     260 | Veronica   | Sven               | SDET           | Database Testing                    | Female | veronicasven@gmail.com | O+          |    11/29/2003 |     11/21/2022 | 12/07/2022 |   19292178758 |   1.75 |     61 | Lawrence Swen          |  16465586311 | Data Analyst              | Maggie Swen       |  16467792921 | Playwright            | mother   | swen@gmail.com        |          690 E 14th St, New York, NY 10009, USA | Veronica Sven            |
      |     261 | Mokosh     | Kai                | Cyber Security | Penetration Testing/Ethical Hacking | Female | mokkai@gmail.com       | B-          |    08/31/1999 |     11/22/2022 | 12/08/2022 |   12173258398 |   1.77 |     63 | Guy Kai                |  19293178767 | Gastroenterologist        | Ann kai           |  19173457689 | Sociologist           | father   | kai@gmail.com         |       636 Greenwich St, New York, NY 10014, USA | Mokosh Kai               |
      |     262 | Serapion   | Umar               | Cyber Security | Penetration Testing/Ethical Hacking | Male   | SUmar@gmail.com        | B+          |    05/07/2005 |     11/23/2022 | 12/09/2022 |   16467712455 |   1.90 |     80 | Sokrat Umar            |  17193960900 | Oncologist                | Gulhanim Umar     |  16462802007 | CNA                   | father   | umar@gmail.com        | 4201 Lake Shore Dr Diamond Point, NY 12824, USA | Serapion Umar            |
      |     263 | Rosine     | Ramon              | Cyber Security | Penetration Testing/Ethical Hacking | Female | RRamon@gmail.com       | O+          |    04/21/2005 |     11/24/2022 | 12/10/2022 |   17193960965 |   1.64 |     55 | Kim Maite              |  12173258347 | Mining Engineer           | Miko Maite        |  12124226560 | Dental Hygienist      | mother   | maite@gmail.com       |       225 East Pittsfield Street, NJ 08070, USA | Rosine Ramon             |
      |     264 | Yancy      | Maite              | SDET           | Database Testing                    | Female | ymaite@gmail.com       | O+          |    09/18/2005 |     11/25/2022 | 12/11/2022 |   16467717801 |   1.73 |     65 | Fernando Ramon         |  19292581733 | Ophthalmologist           | Rosia Ramon       |  16467719297 | Addiction Counselor   | father   | ramon@gmail.com       |                  134 Lynam Road, CT  06903, USA | Yancy Maite              |
      |     265 | Kevin      | Nima               | SDET           | Database Testing                    | Male   | knima@protonmail.com   | O+          |    04/08/1995 |     11/26/2022 | 12/12/2022 |   12173258325 |   1.85 |     80 | Sugato Nima            |  17194625201 | Billing Manager           | Helen Nima        |  19298723401 | Nurse Practitioner    | father   | nima@gmail.com        |         101 Johnson St, Brooklyn, NY 11201, USA | Kevin Nima               |
      |     266 | Julio      | Raimevillavincesio | Cyber Security | Penetration Testing/Ethical Hacking | Male   | juliocst@outlook.com   | A+          |    05/17/2003 |     11/27/2022 | 12/13/2022 |   17194539625 |   1.78 |     64 | Che Raimevillavincesio |  18635551232 | Business Analyst          | Ana Vega          |  18632001868 | Mathematician         | mother   | vega@gmail.com        |             3, Forbes Road, Lexington 01731, MA | Julio Raimevillavincesio |
      |     267 | Damaris    | Correa             | SDET           | Database Testing                    | Female | dcorrea@gmail.com      | B+          |    10/22/2001 |     11/28/2022 | 12/14/2022 |   19293178736 |   1.60 |     50 | Wilmer Correa          |  12120059914 | Physician                 | Sydney Correa     |  12124920554 | Pharmacist            | father   | correa@gmail.com      |           136 W 3rd St, New York, NY 10012, USA | Damaris Correa           |
      |     268 | Sonya      | Bila               | Cyber Security | Penetration Testing/Ethical Hacking | Female | s_bila@protonmail.com  | AB+         |    01/08/2006 |     11/29/2022 | 12/15/2022 |   16465512098 |   1.71 |     57 | Semion Bila            |  17196378021 | Release manager           | Nadiia Bila       |  17190148988 | Restaurant Manager    | father   | bila@gmail.com        |           339 Ocean Ave, New York, NY 11211,USA | Sonya Bila               |
      |     269 | Pavel      | Miroshnichenko     | SDET           | Database Testing                    | Male   | pmirosh@gmail.com      | B-          |    07/13/2001 |     11/30/2022 | 12/16/2022 |   19292581787 |   1.77 |     72 | Makar Miroshnichenko   |  19292585529 | Digital forensics analyst | Liz Cohen         |  16463310739 | Flight Attendant      | mother   | cohen@gmail.com       |                  113 Union Street NJ 07086, USA | Pavel Miroshnichenko     |
      |     270 | Caroline   | Johnstone          | SDET           | Database Testing                    | Female | cjohnstone@gmail.com   | O+          |    12/31/2003 |     11/16/2022 | 12/17/2022 |   17193964586 |   1.69 |     56 | Thomas Johnstone       |  17398876525 | Network architect         | Alina Johnstone   |  12124027705 | Assistant Professor   | mother   | johnstone@gmail.com   |             315, Ave P, Brooklyn, NY 11204, USA | Caroline Johnstone       |
      |     271 | Laura      | Westengard         | Cyber Security | Penetration Testing/Ethical Hacking | Female | lwestengard@gmail.com  | A+          |    07/30/2000 |     11/17/2022 | 12/18/2022 |   16463258367 |   1.65 |     55 | Ken Westengard         |  18634539699 | Neurologist               | Cherryl Hardy     |  16468566785 | Financial Analyst     | mother   | Hardy@gmail.com       |          464, Tremont Street, Rehobot 02769, MA | Laura Westengard         |
      |     272 | Bing       | Cheng              | SDET           | Database Testing                    | Male   | BXCheng@protonmail.com | A-          |    02/02/2004 |     11/18/2022 | 12/19/2022 |   12173258366 |   1.68 |     61 | Xing Cheng             |  12127499808 | Cryptographer             | You Lin           |  19292550377 | Phlebotomist          | father   | cheng@gmail.com       |            371 7th Ave, New York, NY 10001, USA | Bing Cheng               |
      |     273 | Luca       | Negroponte         | SDET           | Database Testing                    | Male   | lnegroponte@gmail.com  | O+          |    09/04/2000 |     11/19/2022 | 12/20/2022 |   16465586312 |   1.65 |     53 | Mario Negroponte       |  19291787664 | Endocrinologist           | Angela Negroponte |  16467245571 | Biostatistician       | mother   | negroponte@gmail.com  |   795 Hulls Farm Road, Stamford, CT  06890, USA | Luca Negroponte          |
