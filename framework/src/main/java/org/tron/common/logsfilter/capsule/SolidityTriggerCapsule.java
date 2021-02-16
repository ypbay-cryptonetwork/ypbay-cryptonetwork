package org.ypbay.common.logsfilter.capsule;

import lombok.Getter;
import lombok.Setter;
import org.ypbay.common.logsfilter.EventPluginLoader;
import org.ypbay.common.logsfilter.trigger.SolidityTrigger;

public class SolidityTriggerCapsule extends TriggerCapsule {

  @Getter
  @Setter
  private SolidityTrigger solidityTrigger;

  public SolidityTriggerCapsule(long latestSolidifiedBlockNum) {
    solidityTrigger = new SolidityTrigger();
    solidityTrigger.setLatestSolidifiedBlockNumber(latestSolidifiedBlockNum);
  }

  @Override
  public void processTrigger() {
    EventPluginLoader.getInstance().postSolidityTrigger(solidityTrigger);
  }
}

