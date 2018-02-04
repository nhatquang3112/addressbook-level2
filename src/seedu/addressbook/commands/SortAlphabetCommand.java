package seedu.addressbook.commands;

import seedu.addressbook.data.person.ReadOnlyPerson;

import java.util.List;


/**
 * Sort all persons in the address book in alphabetical order
 * list all persons to user.
 */
public class SortAlphabetCommand extends Command {

    public static final String COMMAND_WORD = "sortAlphabet";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Sort all persons in the address book in alphabetical order, case insensitive"
            + " then list all persons to user.\n"
            + "Example: " + COMMAND_WORD;


    @Override
    public CommandResult execute() {
        addressBook.sortAlphabet();
        List<ReadOnlyPerson> allPersons = addressBook.getAllPersons().immutableListView();
        return new CommandResult(getMessageForPersonListShownSummary(allPersons), allPersons);
    }
}
