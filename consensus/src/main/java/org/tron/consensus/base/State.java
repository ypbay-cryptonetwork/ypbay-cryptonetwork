package org.tron.consensus.base;

public enum State {
  OK,
  NOT_SYNCED,
  DUP_WITNESS,
  CLOCK_ERROR,
  NOT_MY_TURN,
  NOT_TIME_YET,
  PERMISSION_ERROR,
  LOW_PARTICIPATION,
  PRODUCE_BLOCK_FAILED,
  BACKUP_IS_NOT_MASTER,
  OTHER
}