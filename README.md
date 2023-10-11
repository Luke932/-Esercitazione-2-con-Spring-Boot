# Players Application

Questo è un progetto di esempio per la gestione di giocatori di una squadra sportiva. Utilizza Spring Boot, un framework per lo sviluppo di applicazioni Java, e si integra con un database MySQL per la persistenza dei dati.

## Classi Principali

### PlayersController 🎮
- **Descrizione**: Questa classe gestisce le richieste HTTP relative ai giocatori.
- **Endpoints**:
  - `GET /players` - Restituisce la lista di tutti i giocatori.
  - `GET /players/{id}` - Restituisce il giocatore con l'ID specificato.
  - `POST /players` - Aggiunge un nuovo giocatore.
  - `PUT /players/{id}` - Aggiorna le informazioni di un giocatore esistente.
  - `DELETE /players/{id}` - Elimina un giocatore.

### Player 🧑‍🤝‍🧑
- **Descrizione**: Questa è l'entità che rappresenta un giocatore.
- **Attributi**:
  - `id` (Long) - l'identificatore univoco del giocatore.
  - `firstName` (String) - il nome del giocatore.
  - `lastName` (String) - il cognome del giocatore.
  - `team` (String) - la squadra di appartenenza del giocatore.
  - `position` (String) - la posizione di gioco del giocatore.

### PlayerRepository 🗄️
- **Descrizione**: Questa interfaccia fornisce i metodi per l'accesso al database per la gestione dei giocatori.

### PlayerService e le sue implementazioni 🛠️
- **Descrizione**: Questa interfaccia definisce i metodi per la gestione dei giocatori. Ha due implementazioni: `PlayerServiceDB` che utilizza il database MySQL e `PlayerServiceMock` che fornisce dati mock per scopi di test.

## Avvio dell'Applicazione 🚀

### IntelliJ IDEA
1. Apri IntelliJ IDEA e importa il progetto.
2. Assicurati di avere un'istanza di MySQL in esecuzione sul tuo sistema locale.
3. Configura le credenziali del database nel file `application.properties`.
4. Esegui l'applicazione eseguendo la classe `PlayersApplication`.

## Configurazione del Database 🛢️

### MySQL
- Assicurati di avere un'istanza di MySQL in esecuzione sul tuo sistema.
- Nel file `application.properties`, troverai le configurazioni per il datasource:

spring.datasource.url=jdbc:mysql://localhost:3306/players?useSSL=false&allowPublicKeyRetrieval=true
spring.datasource.username=root
spring.datasource.password=mysqlroot

markdown


## Note aggiuntive 📝
- L'applicazione utilizza Hibernate come implementazione JPA per l'interazione con il database MySQL.
- Le operazioni CRUD (Create, Read, Update, Delete) sono gestite attraverso il repository `PlayerRepository` e il servizio `PlayerService`.

Spero che questa guida ti sia stata utile! In caso di ulteriori domande o problemi, nonon esitare a chiedere. Buon lavoro sul tuo progetto! 🚀
