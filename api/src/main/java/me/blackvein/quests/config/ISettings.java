package me.blackvein.quests.config;

public interface ISettings {
    int getAcceptTimeout();
    void setAcceptTimeout(final int acceptTimeout);
    boolean canAllowCommands();
    void setAllowCommands(final boolean allowCommands);
    boolean canAllowCommandsForNpcQuests();
    void setAllowCommandsForNpcQuests(final boolean allowCommandsForNpcQuests);
    boolean canAllowPranks();
    void setAllowPranks(final boolean allowPranks);
    boolean canAskConfirmation();
    void setAskConfirmation(final boolean askConfirmation);
    boolean canClickablePrompts();
    void setClickablePrompts(boolean clickablePrompts);
    int getConsoleLogging();
    void setConsoleLogging(final int consoleLogging);
    boolean canDisableCommandFeedback();
    void setDisableCommandFeedback(final boolean disableCommandFeedback);
    boolean canGenFilesOnJoin();
    void setGenFilesOnJoin(final boolean genFilesOnJoin);
    boolean canIgnoreLockedQuests();
    void setIgnoreLockedQuests(final boolean ignoreLockedQuests);
    int getKillDelay();
    void setKillDelay(final int killDelay);
    int getMaxQuests();
    void setMaxQuests(final int maxQuests);
    boolean canNpcEffects();
    void setNpcEffects(final boolean npcEffects);
    String getEffect();
    void setEffect(final String effect);
    String getRedoEffect();
    void setRedoEffect(final String redoEffect);
    boolean canShowQuestReqs();
    void setShowQuestReqs(final boolean showQuestReqs);
    boolean canShowQuestTitles();
    void setShowQuestTitles(final boolean showQuestTitles);
    int getStrictPlayerMovement();
    void setStrictPlayerMovement(final int strictPlayerMovement);
    boolean canTrialSave();
    void setTrialSave(final boolean trialSave);
    int getTopLimit();
    void setTopLimit(final int topLimit);
    boolean canTranslateNames();
    void setTranslateNames(final boolean translateItems);
    boolean canTranslateSubCommands();
    void setTranslateSubCommands(final boolean translateSubCommands);
    boolean canUpdateCheck();
    void setUpdateCheck(final boolean updateCheck);
    void init();
}
