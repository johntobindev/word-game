import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Word {
  private String word;
  private String definition;

  public Word(String word, String definition) {
    this.word = word;
    this.definition = definition;
  }

  public String getWord() {
    return this.word;
  }

  public String getDefinition() {
    return this.definition;
  }
}

public class Words {
  private static List<Word> easy = new ArrayList<>(List.of(
    new Word("bridge", "A structure carrying a path or road over an obstacle, e.g. a river."),
    new Word("cinema", "A theatre designed for the purpose of showing films for entertainment."),
    new Word("desk", "A table, often with drawers, which you sit at to write or work."),
    new Word("eye", "The organ of sight of animals."),
    new Word("fact", "A truth verifiable from experience or observation."),
    new Word("garden", "An area of land, usually planted with grass, trees, flowerbeds, etc."),
    new Word("hungry", "Wanting or needing food."),
    new Word("island", "A mass of land surrounded by water and smaller than a continent."),
    new Word("juice", "Any liquid that occurs naturally in or is secreted by plant or animal tissue."),
    new Word("know", "To be acquainted or familiar with."),
    new Word("moon", "Earth's natural satellite."),
    new Word("near", "Close to or not far from."),
    new Word("ocean", "A very large stretch of sea."),
    new Word("promise", "An assurance given by a person, guaranteeing to do or not do something in the future."),
    new Word("queen", "A woman who rules a country as its monarch."),
    new Word("ruler", "A strip of wood used for measuring and drawing straight lines."),
    new Word("school", "An institution where people receive education."),
    new Word("train", "A line of coaches, cars, or wagons, drawn by a locomotive."),
    new Word("voice", "The natural and distinctive speech of a particular person."),
    new Word("wrong", "Not correct.")
  ));

  private static ArrayList<Word> medium = new ArrayList<>(List.of(
    new Word("beacon", "A fire or light set up in a high or prominent position as a warning, signal, or celebration."),
    new Word("classify", "To designate documents or information as officially secret."),
    new Word("disaster", "A sudden accident or a natural catastrophe that causes great damage or loss of life."),
    new Word("exaggerate", "Represent as being larger, better, or worse than it really is."),
    new Word("facade", "A deceptive outward appearance."),
    new Word("generation", "All of the people born and living at about the same time, regarded collectively."),
    new Word("horoscope", "A forecast of a person's future, typically including a delineation of character and circumstances, based on the relative positions of the stars and planets at the time of that person's birth."),
    new Word("inspiration", "The process of being mentally stimulated to do or feel something, especially to do something creative."),
    new Word("laboratory", "A room or building equipped for scientific experiments, research, or teaching, or for the manufacture of drugs or chemicals."),
    new Word("momentum", "The quantity of motion of a moving body, measured as a product of its mass and velocity."),
    new Word("nuance", "A subtle difference in or shade of meaning, expression, or sound."),
    new Word("obituary", "A notice of a death, especially in a newspaper, typically including a brief biography of the deceased person."),
    new Word("pastel", "A crayon made of powdered pigments bound with gum or resin."),
    new Word("quarrel", "A heated argument or disagreement, typically about a trivial issue and between people who are usually on good terms."),
    new Word("rhythm", "A strong, regular repeated pattern of movement or sound."),
    new Word("sculpture", "The art of making three-dimensional representative or abstract forms, especially by carving stone or wood or by casting metal or plaster."),
    new Word("technique", "A way of carrying out a particular task, especially the execution or performance of an artistic work or a scientific procedure."),
    new Word("undermine", "Lessen the effectiveness, power, or ability of, especially gradually or insidiously."),
    new Word("vacuum", "A space entirely devoid of matter."),
    new Word("wriggle", "Twist and turn with quick writhing movements.")
  ));

  private static ArrayList<Word> hard = new ArrayList<>(List.of(
    new Word("abdicate", "To renounce one's throne as monarch."),
    new Word("brusque", "Abrupt in speech or manner."),
    new Word("clairvoyant", "A person who claims to have a supernatural ability to perceive events in the future or beyond normal sensory contact."),
    new Word("defunct", "No longer existing or functioning."),
    new Word("embellish", "Make a story more interesting by adding extra details that are often untrue."),
    new Word("freighter", "A vehicle or person that transports cargo, supplies, or goods."),
    new Word("guerilla", "A member of a small independent group taking part in irregular fighting, typically against larger regular forces."),
    new Word("hierarchy", "A system in which members of an organization or society are ranked according to relative status or authority."),
    new Word("infrastructure", "The basic physical and organisational structures and facilities needed for the operation of a society or enterprise."),
    new Word("jurisdiction", "The extent of the power to make legal decisions and judgements."),
    new Word("kombucha", "A fermented, lightly effervescent, sweetened black tea."),
    new Word("laconic", "Using or involving the minimal use of words."),
    new Word("malfeasance", "Legal wrongdoing."),
    new Word("negligence", "Failure to take proper care over something."),
    new Word("pneumonia", "Inflammation of the lungs, usually caused by an infection."),
    new Word("rehabilitate", "To restore someone to health or normal life."),
    new Word("sanctuary", "A nature reserve or place of safety."),
    new Word("vainglorious", "Excessively proud of oneself or one's achievements."),
    new Word("windsock", "A conical textile tube used as a basic indicator of wind speed and direction."),
    new Word("zephyr", "A soft and gentle breeze.")
  ));

  /**
   * Get 10 random words for a given difficulty
   */
  public static List<Word> getWords(String difficulty) {
    List<Word> words;

    switch (difficulty) {
      case "EASY": {
        words = easy;
        break;
      }
      case "MEDIUM": {
        words = medium;
        break;
      }
      case "HARD": {
        words = hard;
        break;
      }
      default: {
        words = easy;
      }
    }

    Collections.shuffle(words);
    return words.subList(0, 10);
  }
}
