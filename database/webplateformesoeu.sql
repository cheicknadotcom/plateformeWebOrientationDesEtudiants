-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  mar. 24 mai 2022 à 03:19
-- Version du serveur :  10.4.10-MariaDB
-- Version de PHP :  7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `webplateformesoeu`
--

-- --------------------------------------------------------

--
-- Structure de la table `offres`
--

DROP TABLE IF EXISTS `offres`;
CREATE TABLE IF NOT EXISTS `offres` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `connaissance_technique` varchar(255) DEFAULT NULL,
  `dateoffre` date DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `diplome` varchar(255) DEFAULT NULL,
  `region` varchar(255) DEFAULT NULL,
  `salaire` double DEFAULT NULL,
  `titre` varchar(255) DEFAULT NULL,
  `entreprise_id` bigint(20) DEFAULT NULL,
  `nom_entreprise` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK6od7fi5dfbjlg6dqyng8ndk1n` (`entreprise_id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `offres`
--

INSERT INTO `offres` (`id`, `connaissance_technique`, `dateoffre`, `description`, `diplome`, `region`, `salaire`, `titre`, `entreprise_id`, `nom_entreprise`) VALUES
(1, 'java', '2022-02-09', 'operateur telephonique', 'master 2', 'dakar', 4000000, 'site', NULL, NULL),
(2, 'java', '2022-02-10', 'operateur telephonique', 'master 2', 'dakar', 4000000, 'site', NULL, NULL),
(3, 'java', '2022-02-02', 'operateur telephonique', 'master 2', 'dakar', 4000000, 'site', NULL, 'Sonatel Dakar');

-- --------------------------------------------------------

--
-- Structure de la table `recrutement`
--

DROP TABLE IF EXISTS `recrutement`;
CREATE TABLE IF NOT EXISTS `recrutement` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `adresse_email` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `passwordd_confirme` varchar(255) DEFAULT NULL,
  `post_entreprise` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `thequecv`
--

DROP TABLE IF EXISTS `thequecv`;
CREATE TABLE IF NOT EXISTS `thequecv` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `connaissance` varchar(255) DEFAULT NULL,
  `diplome` varchar(255) DEFAULT NULL,
  `experience` varchar(255) DEFAULT NULL,
  `fichier` longblob DEFAULT NULL,
  `specialite` varchar(255) DEFAULT NULL,
  `fk_add_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKc60ui6jmnxp4t9jqhoekuo4wb` (`fk_add_id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `thequecv`
--

INSERT INTO `thequecv` (`id`, `connaissance`, `diplome`, `experience`, `fichier`, `specialite`, `fk_add_id`) VALUES
(1, 'java', 'master', 'deux ans', 0x436f6d6d616e644d6f6e676f64622e646f6378, 'Informatique', 1),
(2, 'jeespringBoot,java,php', 'master 2', 'trois ans', 0x636f6d6d616e644d6f6e676f2e747874, 'ISI', 17),
(3, 'Statistique', 'ISE', 'deux ans', 0x43565f43686569636b6e615f446f756d6269615f762e706466, 'Ecometrie', 19),
(4, 'sprintboot', 'master 2', 'cinq ans', '', 'ISI', 22),
(5, 'Hacking,Audit', 'master 2', 'cinq ans', '', 'Informatique', 23);

-- --------------------------------------------------------

--
-- Structure de la table `t_utilisateur`
--

DROP TABLE IF EXISTS `t_utilisateur`;
CREATE TABLE IF NOT EXISTS `t_utilisateur` (
  `dtype` varchar(31) NOT NULL,
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `addresse_email` varchar(255) DEFAULT NULL,
  `adresse` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `password_confirme` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `region` varchar(255) DEFAULT NULL,
  `secteur_activite` varchar(255) DEFAULT NULL,
  `site_web` varchar(255) DEFAULT NULL,
  `tel` varchar(255) DEFAULT NULL,
  `date_naissance` date DEFAULT NULL,
  `matricule` varchar(255) DEFAULT NULL,
  `niveau_etude` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `specialite` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=24 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `t_utilisateur`
--

INSERT INTO `t_utilisateur` (`dtype`, `id`, `addresse_email`, `adresse`, `nom`, `password`, `password_confirme`, `type`, `description`, `region`, `secteur_activite`, `site_web`, `tel`, `date_naissance`, `matricule`, `niveau_etude`, `prenom`, `specialite`) VALUES
('Etudiant', 1, 'cheickna@gmail.com', 'FASS-CASSIER', 'Doumbia', 'cd', 'cd', 'Administrateur', NULL, NULL, NULL, NULL, '0022176768938', '2022-02-21', 'CD1478', 'Master 2', 'Cheickna', 'Informatique'),
('Entreprise', 2, 'snsonatel.@gmail.com', 'FASS-CASSIER', 'SONATEL', 'sn', 'sn', 'Entreprise', 'operateur telephonique', 'dakar', 'TELECOM', 'www.sonatel.com', '0022176768938', NULL, NULL, NULL, NULL, NULL),
('Universite', 21, 'amadou@gmail.com', 'FASS-CASSIER', 'Amadou hapateba', 'am', 'am', 'Universite', 'Universite', 'dakar', NULL, 'www.amadouhapateba.com', '2214786', NULL, NULL, NULL, NULL, NULL),
('Entreprise', 20, 'sona@gmail.com', 'sacre-coeur', 'Sonatel', 'sn', 'sn', 'Entreprise', 'operateur telephonique', 'dakar', 'TELECOM', 'www.sonatel.com', '221428', NULL, NULL, NULL, NULL, NULL),
('Etudiant', 19, 'diakiteMoussa@gmail.com', 'COCODI', 'Diakite', 'dm', 'dm', 'Etudiant', NULL, NULL, NULL, NULL, '002217746824', '2000-12-16', '144MD4', 'Licence 3', 'Moussa', 'Economioe'),
('Entreprise', 18, 'cheickna2@gmail.com', 'Liberte 5', 'SONATEL', 'cd', 'cd', 'Entreprise', 'operateur telephonique', 'dakar', 'TELECOM', 'www.sonatel.com', '1447', NULL, NULL, NULL, NULL, NULL),
('Etudiant', 17, 'snfree@gmail.com', 'FASS-CASSIER', 'Doumbia', 'sf', 'sf', 'Etudiant', NULL, NULL, NULL, NULL, '0022176768938', '1997-02-04', 'CD1478', 'Master 2', 'Cheickna', 'Informatique'),
('Etudiant', 22, 'gous@gmail.com', 'FASS-CASSIER', 'Doumbia', 'gd', 'gd', 'Etudiant', NULL, NULL, NULL, NULL, '002217768938', '2000-01-05', 'CD1478', 'Master 2', 'gaoussou', 'ISI'),
('Etudiant', 23, 'gealmoustapha@gmail.com', 'FASS-CASSIER', 'Faye', 'gm', 'gm', 'Etudiant', NULL, NULL, NULL, NULL, '002217768938', '1994-06-13', 'FayeMoustapha1478', 'Master 2', 'Moustapha', 'Hacker');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
