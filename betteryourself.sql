-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Czas generowania: 28 Lut 2016, 14:24
-- Wersja serwera: 5.6.20
-- Wersja PHP: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Baza danych: `betteryourself`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `cel`
--

CREATE TABLE IF NOT EXISTS `cel` (
  `Imie` varchar(30) NOT NULL,
  `Nazwisko` varchar(30) NOT NULL,
  `Udo` int(3) NOT NULL,
  `Lydka` int(2) NOT NULL,
  `Przedramie` int(2) NOT NULL,
  `Klatka` int(3) NOT NULL,
  `Biceps` int(2) NOT NULL,
  `Waga` int(3) NOT NULL,
  `Pas` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Zrzut danych tabeli `cel`
--

INSERT INTO `cel` (`Imie`, `Nazwisko`, `Udo`, `Lydka`, `Przedramie`, `Klatka`, `Biceps`, `Waga`, `Pas`) VALUES
('Maciej', 'Wojtasik', 80, 50, 45, 148, 56, 142, 92);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `cwiczenie`
--

CREATE TABLE IF NOT EXISTS `cwiczenie` (
  `NAZWA` varchar(35) NOT NULL DEFAULT 'CWICZENIE',
  `TYP` varchar(20) DEFAULT NULL,
  `PARTIA` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Zrzut danych tabeli `cwiczenie`
--

INSERT INTO `cwiczenie` (`NAZWA`, `TYP`, `PARTIA`) VALUES
('2glowe', 'silowe', 'Uda'),
('Allachy', 'silowe', 'Brzuch'),
('Bic hantle', 'silowe', 'Biceps'),
('Bic sztanga', 'silowe', 'Biceps'),
('Dzien dobry', 'silowe', 'Plecy'),
('Francuskie', 'silowe', 'Triceps'),
('Hantle bokiem', 'silowe', 'Barki'),
('Hantle na lawce poziomej', 'silowe', 'Klatka'),
('Hantle przodem', 'silowe', 'Barki'),
('Hantle skos', 'silowe', 'Klatka'),
('Martwy ciag', 'silowe', 'Plecy'),
('Podciaganie', 'silowe', 'Plecy'),
('Pompki szwedzkie', 'silowe', 'Triceps'),
('Sklony boczne', 'silowe', 'Brzuch'),
('Suwnica', 'silowe', 'Uda'),
('Szrugsy', 'silowe', 'Plecy'),
('Unoszenie nóg w zwisie', 'silowe', 'Brzuch'),
('Wioslowanie', 'silowe', 'Plecy'),
('Wioslowanie hantlami', 'silowe', 'Plecy'),
('Wspiecia na palce', 'silowe', 'Lydki'),
('Wyciskanie hantli siedzac', 'silowe', 'Barki'),
('Wyciskanie lezac', 'silowe', 'Klatka'),
('Wyciskanie na dodatniej', 'silowe', 'Klatka'),
('Wykroki', 'silowe', 'Uda'),
('Zolnierskie', 'silowe', 'Barki');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `pomiar`
--

CREATE TABLE IF NOT EXISTS `pomiar` (
  `typ_pomiaru` varchar(20) NOT NULL,
  `wartosc` int(4) DEFAULT NULL,
  `data_dodania` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Zrzut danych tabeli `pomiar`
--

INSERT INTO `pomiar` (`typ_pomiaru`, `wartosc`, `data_dodania`) VALUES
('Waga', 75, '2015-10-12'),
('Pas', 84, '2015-10-12'),
('Biceps', 35, '2015-10-12'),
('Klatka', 107, '2015-10-12'),
('Udo', 58, '2015-10-12'),
('Lydka', 39, '2015-10-12'),
('Przedramie', 32, '2015-10-12'),
('Waga', 70, '2016-01-24'),
('Pas', 80, '2016-01-24'),
('Biceps', 34, '2016-01-24'),
('Klatka', 106, '2016-01-24'),
('Udo', 57, '2016-01-24'),
('?ydka', 38, '2016-01-24'),
('Przedrami?', 31, '2016-01-24');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `posilek`
--

CREATE TABLE IF NOT EXISTS `posilek` (
  `ILOSC` int(4) unsigned NOT NULL,
  `DATA` date NOT NULL,
  `NAZWA` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Zrzut danych tabeli `posilek`
--

INSERT INTO `posilek` (`ILOSC`, `DATA`, `NAZWA`) VALUES
(200, '2016-02-01', 'Losos'),
(230, '2016-02-01', 'Lopatka wieprzowa'),
(650, '2016-02-01', 'Banan'),
(500, '2016-02-02', 'Mleko 2%'),
(20, '2016-02-02', 'Twarog chudy'),
(300, '2016-02-02', 'Jablko'),
(95, '2016-02-06', 'Mleko 2%'),
(95, '2016-02-06', 'Maslo extra');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `produkty`
--

CREATE TABLE IF NOT EXISTS `produkty` (
  `Nazwa` varchar(50) NOT NULL,
  `Kategoria` varchar(20) NOT NULL,
  `kcal` int(4) unsigned NOT NULL,
  `W` int(2) unsigned NOT NULL,
  `B` int(2) unsigned NOT NULL,
  `T` int(2) unsigned NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Zrzut danych tabeli `produkty`
--

INSERT INTO `produkty` (`Nazwa`, `Kategoria`, `kcal`, `W`, `B`, `T`) VALUES
('Banan', 'owoce', 95, 22, 1, 0),
('Bialko jaja kurzego', 'jaja', 49, 1, 11, 0),
('Cebula', 'warzywa', 30, 5, 1, 0),
('Chleb zytni razowy', 'zbozowe', 223, 46, 6, 2),
('Dorsz', 'ryby', 78, 0, 18, 1),
('Jablko', 'owoce', 46, 10, 0, 0),
('Jajo kurze cale', 'jaja', 139, 1, 13, 10),
('Kajzerki', 'zbozowe', 296, 57, 7, 4),
('Lopatka wieprzowa', 'mieso', 257, 0, 16, 21),
('Losos', 'ryby', 201, 0, 20, 14),
('Maslo extra', 'tluszcze', 735, 1, 1, 82),
('Mieso z piersi kurczaka', 'mieso', 99, 0, 21, 1),
('Mleko 2%', 'nabial', 51, 5, 3, 2),
('Oliwa z oliwek', 'tluszcze', 882, 0, 0, 100),
('Orzechy arachidowe', 'orzechy', 560, 12, 26, 46),
('Orzechy wloskie', 'orzechy', 645, 11, 16, 60),
('Papryka czerwona', 'warzywa', 28, 5, 1, 0),
('Twarog chudy', 'nabial', 99, 3, 20, 1);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `seria`
--

CREATE TABLE IF NOT EXISTS `seria` (
  `CWICZENIE` varchar(35) NOT NULL DEFAULT 'CWICZENIE',
  `NR` int(11) NOT NULL,
  `OBCIAZENIE` int(11) DEFAULT '0',
  `LICZBA_POWT` int(11) NOT NULL,
  `CZAS_PRZERWY` int(11) DEFAULT NULL,
  `DATA_TRENINGU` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Zrzut danych tabeli `seria`
--

INSERT INTO `seria` (`CWICZENIE`, `NR`, `OBCIAZENIE`, `LICZBA_POWT`, `CZAS_PRZERWY`, `DATA_TRENINGU`) VALUES
('2glowe', 14, 37, 8, 120, '2015-12-31'),
('2glowe', 15, 37, 8, 120, '2015-12-31'),
('Bic sztanga', 6, 30, 10, 120, '2016-01-05'),
('Bic sztanga', 10, 20, 10, 120, '2016-01-04'),
('Bic sztanga', 11, 25, 5, 120, '2016-01-04'),
('Bic sztanga', 12, 25, 3, 120, '2016-01-04'),
('Dzien dobry', 16, 45, 8, 120, '2015-12-31'),
('Dzien dobry', 17, 50, 8, 120, '2015-12-31'),
('Hantle bokiem', 7, 8, 12, 120, '2015-12-31'),
('Hantle bokiem', 8, 9, 10, 120, '2015-12-31'),
('Hantle przodem', 9, 7, 12, 120, '2015-12-31'),
('Hantle przodem', 10, 7, 12, 120, '2015-12-31'),
('Hantle skos', 4, 20, 8, 120, '2016-01-04'),
('Hantle skos', 5, 23, 6, 120, '2016-01-04'),
('Hantle skos', 6, 23, 5, 120, '2016-01-04'),
('Podciaganie', 1, 0, 8, 120, '2015-12-31'),
('Podciaganie', 2, 0, 6, 120, '2015-12-31'),
('Podciaganie', 3, 0, 5, 120, '2015-12-31'),
('Pompki szwedzkie', 11, 40, 10, 120, '2015-12-31'),
('Pompki szwedzkie', 12, 45, 8, 120, '2015-12-31'),
('Pompki szwedzkie', 13, 45, 7, 120, '2015-12-31'),
('Suwnica', 15, 90, 8, 120, '2016-01-04'),
('Unoszenie nóg w zwisie', 1, 1, 1, 120, '2016-02-12'),
('Wioslowanie hantlami', 4, 17, 12, 120, '2015-12-31'),
('Wioslowanie hantlami', 5, 17, 11, 120, '2015-12-31'),
('Wioslowanie hantlami', 6, 20, 10, 120, '2015-12-31'),
('Wspiecia na palce', 18, 2, 10, 120, '2015-12-31'),
('Wspiecia na palce', 19, 2, 10, 120, '2015-12-31'),
('Wspiecia na palce', 20, 2, 10, 120, '2015-12-31'),
('Wyciskanie hantli siedzac', 1, 15, 10, 120, '2016-02-05'),
('Wyciskanie lezac', 1, 65, 8, 120, '2016-01-04'),
('Wyciskanie lezac', 1, 65, 8, 120, '2016-01-05'),
('Wyciskanie lezac', 2, 65, 5, 120, '2016-01-04'),
('Wyciskanie lezac', 3, 70, 2, 120, '2016-01-04'),
('Wyciskanie lezac', 3, 60, 10, 120, '2016-01-05'),
('Wyciskanie lezac', 4, 70, 5, 120, '2016-01-05'),
('Wyciskanie na dodatniej', 2, 2, 2, 120, '2016-02-05'),
('Wykroki', 13, 12, 10, 120, '2016-01-04'),
('Wykroki', 14, 12, 10, 120, '2016-01-04'),
('Zolnierskie', 5, 40, 10, 120, '2016-01-05'),
('Zolnierskie', 7, 35, 12, 120, '2016-01-04'),
('Zolnierskie', 8, 35, 10, 120, '2016-01-04'),
('Zolnierskie', 9, 40, 6, 120, '2016-01-04');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `trening`
--

CREATE TABLE IF NOT EXISTS `trening` (
  `nazwa` varchar(20) NOT NULL DEFAULT 'BEZ NAZWY',
  `data_treningu` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Zrzut danych tabeli `trening`
--

INSERT INTO `trening` (`nazwa`, `data_treningu`) VALUES
('', '2016-01-01'),
('Back1', '2016-01-06'),
('Back2', '2015-12-31'),
('Front', '2016-02-05'),
('Front2', '2016-01-04'),
('ghj', '2016-02-12'),
('SuperProTrening', '2016-01-05');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `uzytkownik`
--

CREATE TABLE IF NOT EXISTS `uzytkownik` (
  `Imie` varchar(30) NOT NULL,
  `Nazwisko` varchar(30) NOT NULL,
  `Data_urodzenia` date NOT NULL,
  `Plec` varchar(1) NOT NULL DEFAULT 'M',
  `Wzrost` int(3) NOT NULL DEFAULT '175',
  `kcal` int(5) NOT NULL DEFAULT '2500',
  `B` int(4) DEFAULT '150',
  `W` int(4) NOT NULL DEFAULT '220',
  `T` int(4) NOT NULL DEFAULT '80',
  `BF` int(2) NOT NULL DEFAULT '20',
  `Nick` varchar(20) NOT NULL,
  `Haslo` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Zrzut danych tabeli `uzytkownik`
--

INSERT INTO `uzytkownik` (`Imie`, `Nazwisko`, `Data_urodzenia`, `Plec`, `Wzrost`, `kcal`, `B`, `W`, `T`, `BF`, `Nick`, `Haslo`) VALUES
('Maciej', 'Wojtasik', '2016-02-01', 'M', 177, 2502, 180, 238, 86, 9, '', '');

--
-- Indeksy dla zrzutów tabel
--

--
-- Indexes for table `cwiczenie`
--
ALTER TABLE `cwiczenie`
 ADD PRIMARY KEY (`NAZWA`);

--
-- Indexes for table `produkty`
--
ALTER TABLE `produkty`
 ADD UNIQUE KEY `Nazwa` (`Nazwa`);

--
-- Indexes for table `seria`
--
ALTER TABLE `seria`
 ADD PRIMARY KEY (`CWICZENIE`,`NR`,`DATA_TRENINGU`);

--
-- Indexes for table `trening`
--
ALTER TABLE `trening`
 ADD PRIMARY KEY (`nazwa`,`data_treningu`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
