package dk.pd3.data

val mockedJsonMultipleChoiceTask = """
    {
      "id": "delprove-2A",
      "instruction": "Læs teksten Læs skønlitteratur og bliv en bedre leder. Herunder er der tre spørgsmål til teksten. Til hvert spørgsmål er der angivet tre svarmuligheder: A, B og C. Sæt kryds ved det rigtige svar.",
      "originalText": "Vi læser skønlitteratur for at blive underholdt, men vi kan også bruge litteraturen til at blive klogere på os selv og andre. Det gælder fx for Ditte Simonsen. Som topleder har man typisk en travl og krævende arbejdsdag, hvor det er vigtigt at være mentalt og fysisk på toppen hele tiden. Det er måske en af forklaringerne på, at mange topledere dyrker meget sport i deres fritid. Ditte Simonsen, der er leder i en større medicinalvirksomhed, er dog ikke til hård fysisk træning. Hun gør noget andet. Hun læser skønlitteratur: 'Jeg har altid elsket at læse og bruger i dag også skønlitteratur som inspiration til at blive en bedre leder. For når jeg læser skønlitteratur, bliver jeg ikke blot underholdt, jeg bliver også klogere på mennesker,' siger hun og fortsætter: 'For mig forholder det sig sådan, men for nogle kan det måske lyde overraskende, at man kan blive en bedre leder af at læse skønlitteratur. Mange topledere dyrker meget sport for at holde sig i god form og for dermed at være effektive på arbejdet. Læsning af skønlitteratur er jo på mange måder det modsatte af fysisk træning og mål, der skal nås. Det tager tid, og man sidder stille og roligt og slapper af.' ...",
      "questions": [
        {
          "id": "q1",
          "questionText": "Hvilket af følgende udsagn er i overensstemmelse med det, Ditte Simonsen giver udtryk for om skønlitteratur?",
          "options": [
            {
              "id": "A",
              "optionText": "Hun synes, det er overraskende, at man kan blive en bedre leder af at læse skønlitteratur."
            },
            {
              "id": "B",
              "optionText": "Hun læser ikke kun skønlitteratur for at blive klogere på mennesker."
            },
            {
              "id": "C",
              "optionText": "Hun kan kun slappe af, hvis hun sidder stille og roligt og læser skønlitteratur."
            }
          ],
          "correctOptionId": "B"
        },
        {
          "id": "q2",
          "questionText": "Hvad giver Ditte Simonsen blandt andet udtryk for om sine lederkollegers hårde fysiske træning?",
          "options": [
            {
              "id": "A",
              "optionText": "Hun mener, den har en positiv effekt på deres kommunikation med medarbejderne i virksomheden."
            },
            {
              "id": "B",
              "optionText": "Hun mener, det giver dem mindre energi til deres familier, at de skal op kl. 5 hver morgen."
            },
            {
              "id": "C",
              "optionText": "Hun mener ikke, de har lige så stor glæde af deres træning, som hun har af at læse skønlitteratur."
            }
          ],
          "correctOptionId": "A"
        },
        {
          "id": "q3",
          "questionText": "Hvorfor foretrækker Ditte Simonsen at læse skønlitteratur frem for managementlitteratur?",
          "options": [
            {
              "id": "A",
              "optionText": "Den indeholder individuelle beskrivelser af forskellige mennesker."
            },
            {
              "id": "B",
              "optionText": "Den indeholder konkrete råd om, hvordan man kan blive en god leder."
            },
            {
              "id": "C",
              "optionText": "Den er ikke så tidskrævende at læse som managementlitteratur."
            }
          ],
          "correctOptionId": "A"
        }
      ]
    }

""".trimIndent()

val mockedJsonTextInsertTask = """
    {
      "id": "delprove-2B",
      "instruction": "Læs teksten Job og handicap. I teksten er der fjernet fem tekstdele. På dette opgaveark findes de fem tekstdele samt to ekstra, der ikke passer i teksten. Tekstdelene er angivet A, B, C, D, E, F og G. Udfyld skemaet nederst på siden. I skemaet skrives bogstavet for den tekstdel, der passer ind i teksten det sted, der er markeret med tallet. Hvert bogstav må kun bruges én gang.",
      "originalText": "Der mangler arbejdskraft i Danmark, og der er brug for alle hænder og hoveder. Sådan lyder det ofte fra politikere og økonomer. Men det er ikke lige let for alle at få et arbejde. Heller ikke selvom de både har en god uddannelse og har lyst til at gå i gang med en karriere. Det drejer sig blandt andet om de mennesker, der har et handicap. [g1] Hvis man har et handicap, kan det derfor blive svært at passe et arbejde – men det er bestemt ikke sikkert! Sikkert er det dog, at der er færre nyuddannede med et handicap, der kommer i arbejde, end nyuddannede uden et handicap. Måske er det ikke så overraskende, men det var alligevel interessant nok til, at VIA University College satte sig for at undersøge det nærmere. Resultatet var rapporten Fra uddannelse til første job – med handicap, som udkom i 2020. Formålet med undersøgelsen var at finde ud af, hvor mange nyuddannede med et handicap, der er tilknyttet arbejdsmarkedet, og på hvilken måde de er det. Ja, og der er store forskelle i tilknytningen til arbejdsmarkedet. [g2] Konkret sammenlignede man nyuddannede med og uden et handicap i det første år, efter de havde afsluttet deres uddannelse. I perioden 2012-2016 var der 266.515 personer, der afsluttede en videregående uddannelse, og af dem havde 4.793 personer et handicap. Det svarer til cirka 1,8 % af alle nyuddannede i perioden. Tendensen var klar. Hele 81 % af de nyuddannede uden et handicap var efter tolv måneder kommet ind på arbejdsmarkedet. [g3] Måske handler de nedslående tal også om selvværdet hos de nyuddannede med et handicap. En tredjedel af dem mente, allerede mens de var studerende, at deres handicap ville få en betydning for, om de overhovedet kunne få et job. Og halvdelen mente, at deres handicap ville få stor betydning for, hvordan de ville klare deres job, hvis de endelig fik et. [g4] Endelig viste undersøgelsen også, at mange mennesker med et handicap ikke kender særlig meget til de mange forskellige støttemuligheder, der er på arbejdsmarkedet. Disse muligheder kaldes også for kompenserende ordninger, og de er til en vis grad finansieret af staten. Fx kan en person med et handicap få personlig assistance. Den personlige assistent kan fx hjælpe med bestemte løft, med at køre bil, med at skrive eller læse korrektur. Man kan også få betalt visse hjælpemidler. Det kan fx være særligt undervisningsmateriale, særligt værktøj eller en speciel indretning af kontoret. Endelig kan nyuddannede med et handicap også få løntilskud i deres første job. Det vil hjælpe dem til at få den første erfaring med det fag, de har uddannet sig indenfor, og til at skabe sig et netværk. De fleste mennesker – både dem med og uden et handicap – har oplevet, hvor vigtigt det er at have et bredt professionelt netværk. Rapporten kommer selvfølgelig også med en række anbefalinger til, hvordan man kan gøre det lettere for mennesker med et handicap at komme i arbejde. Et af forslagene er at tilbyde dem et kursus i jobsøgning. [g5] Desuden ville de måske have glæde af frivillige mentorer, der har samme uddannelse, som de selv har. Mentorerne ville kunne bidrage med viden om alt fra ansættelsesproces til arbejdspladskultur. Og hvem ved? Måske kan det hjælpe den enkelte med et handicap til hurtigt at komme ind på arbejdsmarkedet – og blive der.",
      "options": [
        {
          "id": "A",
          "optionText": "Nogle er faktisk slet ikke en del af det – sådan vil det nok altid være. Andre har måske fået et job, men den virksomhed, de arbejder for, bliver til en vis grad kompenseret af kommunen."
        },
        {
          "id": "B",
          "optionText": "Fx er der flere og flere mennesker med et handicap, der simpelthen vælger, at de slet ikke vil have et arbejde. I hvert fald ikke samme slags arbejde som dem uden et synligt handicap."
        },
        {
          "id": "C",
          "optionText": "Det kan være svært at definere præcist, hvad det vil sige. Men i ordbogen står der, at det er en permanent fysisk eller psykisk svaghed, der begrænser ens muligheder i hverdagen."
        },
        {
          "id": "D",
          "optionText": "Det lyder måske banalt, men mange af dem har ikke haft et studiejob. Derfor har de i praksis svært ved at give eksempler på deres kompetencer og at beskrive deres erfaringer."
        },
        {
          "id": "E",
          "optionText": "Alle undersøgelser har indtil nu peget på, at mennesker med et handicap har lige så let ved at klare et almindeligt lønarbejde som mennesker uden et handicap. Og det har arbejdsgiverne endelig fået øjnene op for."
        },
        {
          "id": "F",
          "optionText": "Det samme var desværre ikke tilfældet for dem med et handicap. Af dem var kun seks ud af ti kommet i en eller anden form for arbejde inden for den samme periode."
        },
        {
          "id": "G",
          "optionText": "Der er bare ikke noget, der peger på, at de har ret. I undersøgelsen fra 2020 har man lavet en række grundige interviews med en lille gruppe mennesker med et handicap, der passer et almindeligt arbejde."
        }
      ],
      "correctOptions": [
        {
          "gapNumber": 1,
          "correctOptionId": "C"
        },
        {
          "gapNumber": 2,
          "correctOptionId": "A"
        },
        {
          "gapNumber": 3,
          "correctOptionId": "F"
        },
        {
          "gapNumber":

""".trimIndent()

val mockedJsonWordChoiceTask = """
{
  "id": "delprove-3",
  "instruction": "Læs teksten Vindmøller møder modstand. Der er fjernet otte ord eller udtryk, og de otte huller er angivet med tallene 1-8. På dette opgaveark er der for hvert hul (1-8) angivet fire ord eller udtryk: A, B, C og D. Sæt kryds ved det ord eller udtryk, der passer til hvert af hullerne i teksten.",
  "originalText": "Opsætningen af vindmøller har generelt både politisk og folkelig opbakning i Danmark. Der er [g1] nogle ulemper forbundet med vindmøller. Det gælder både for borgere, som bor tæt på de vindmøller, der sættes op, og for naturen. Danmark har et ambitiøst klimamål om, at der i 2030 skal udledes 70 % mindre drivhusgas end i 1990. Målet skal nås ved at omstille det danske energiforbrug fra kul, olie og gas til grønne energiformer. Det er dyrt, men det er ikke den eneste [g2]. For at lykkes med omstillingen er det nødvendigt at øge produktionen af grøn energi markant. Det sker i Danmark i høj grad gennem en satsning på vindenergi. [g3] er der i de senere år sat vindmøller op overalt i Danmark. Udviklingen er også blevet hjulpet på vej af, at det er blevet en bedre forretning at producere vindenergi. Teknologien er nemlig blevet bedre og møllerne større. Det har øget interessen blandt private firmaer for at investere i store vindmølleprojekter. Men flere steder møder projekterne modstand fra lokale borgere. De store vindmøller kan [g4] ses og høres vidt omkring. For at undgå ulemperne med støj og med, at de store vindmøller kan ses på lang afstand, kan man sætte dem op på havet. [g5] er imidlertid, at de er dyrere at sætte op på havet, og jo længere ude på havet de sættes op, jo dyrere er det. Man vælger derfor ofte mellemløsningen og bygger havvindmøllerne relativt tæt på kysten. Her kan de dog stadig ses fra land, og det kan få berørte borgere til at protestere. De mener ikke, at netop deres udsigt skal forstyrres af vindmøller, og at [g6] møllernes placering inden for synsvidde også er, at deres huse vil falde i pris. Protesterne kan sætte de lokale politikere i landets kommuner under pres. Det er nemlig kommunerne, der afgør, hvor møllerne skal sættes op. Det er også kommunerne, der skal behandle klager fra borgerne. Når borgere klager, kan det [g7] kommunernes sagsbehandling af vindmølleprojekter. Nogle gange kan en klagesag faktisk ende med, at projekter ikke blot trækker ud, men helt må opgives. Det er dog ikke kun borgernes [g8] at sætte vindmøller op, der kan forsinke eller forhindre processen. Det kan også hensyn til naturen. Store dele af Danmarks natur er nemlig sikret med Naturbeskyttelsesloven. Undersøgelser af, om beskyttede dyrearter er truet, eller om havstrømme forstyrres, kan være meget tidskrævende. Hvis en undersøgelse ender med at konkludere, at opstillingen af vindmøller kan skade naturen, kan dette også føre til, at planer om at sætte vindmøller op opgives.",
  "blanks": [
    {
      "blankId": "g1",
      "options": [
        "sjældent",
        "ydermere",
        "imidlertid",
        "hermed"
      ]
    },
    {
      "blankId": "g2",
      "options": [
        "forklaring",
        "fordel",
        "betingelse",
        "udfordring"
      ]
    },
    {
      "blankId": "g3",
      "options": [
        "Desuden",
        "Derfor",
        "Omvendt",
        "Alligevel"
      ]
    },
    {
      "blankId": "g4",
      "options": [
        "dermed",
        "dog",
        "nemlig",
        "sjældent"
      ]
    },
    {
      "blankId": "g5",
      "options": [
        "Problematikken",
        "Grunden",
        "Forudsætningen",
        "Påstanden"
      ]
    },
    {
      "blankId": "g6",
      "options": [
        "kravet til",
        "årsagen til",
        "følgen af",
        "formålet med"
      ]
    },
    {
      "blankId": "g7",
      "options": [
        "forenkle",
        "forkorte",
        "lette",
        "forlænge"
      ]
    },
    {
      "blankId": "g8",
      "options": [
        "forslag til",
        "modstand mod",
        "opbakning til",
        "ansøgninger om"
      ]
    }
  ],
  "correctOptions": [
    {
      "blankId": "g1",
      "correctOption": "imidlertid"
    },
    {
      "blankId": "g2",
      "correctOption": "udfordring"
    },
    {
      "blankId": "g3",
      "correctOption": "Desuden"
    },
    {
      "blankId": "g4",
      "correctOption": "nemlig"
    },
    {
      "blankId": "g5",
      "correctOption": "Grunden"
    },
    {
      "blankId": "g6",
      "correctOption": "årsagen til"
    },
    {
      "blankId": "g7",
      "correctOption": "forlænge"
    },
    {
      "blankId": "g8",
      "correctOption": "modstand mod"
    }
  ]
}

""".trimIndent()

val mockedJsonOpenEndedTask = """
    {
  "id": "delprove-1",
  "instruction": "Søg informationer i tekstsamlingen Sønderjylland. Brug indholdsfortegnelsen. Svar præcist og kort på spørgsmålene.",
  "originalText": "Sønderjylland er en historisk region i Danmark. Regionen er kendt for sin kultur, madtraditioner og historiske attraktioner. Området byder på vandreruter som Hærvejen og Gendarmstien, rige kageborde og betydningsfulde steder som Sønderborg Slot og Frøslevlejren. Sønderjylland har en unik historie med Genforeningen i 1920, og i dag er der officielle nationale mindretal. Flere kommuner tilbyder støtte til tilflyttere, herunder jobmuligheder og netværksaktiviteter.",
  "questions": [
    {
      "id": "q1",
      "questionText": "Hvilket materiale er de gamle broer langs Hærvejen lavet af?",
      "correctAnswer": "Træ og sten"
    },
    {
      "id": "q2",
      "questionText": "Hvad blev Gendarmstien certificeret som i 2015?",
      "correctAnswer": "Leading Quality Trail – Best of Europe"
    },
    {
      "id": "q3",
      "questionText": "Hvor mange kirker ligger der på ruten Camino Haderslev Næs?",
      "correctAnswer": "15 kirker"
    },
    {
      "id": "q4",
      "questionText": "Hvilken dato er Genforeningsdagen?",
      "correctAnswer": "15. juni"
    },
    {
      "id": "q5",
      "questionText": "Er den tysksindede befolkningsgruppe i Sønderjylland officielt anerkendt som et nationalt mindretal?",
      "correctAnswer": "Ja"
    }
  ]
}

""".trimIndent()
