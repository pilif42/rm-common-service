package uk.gov.ons.ctp.common.health;

import lombok.Data;
import net.sourceforge.cobertura.CoverageIgnore;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Simple abstract class for the scheduled tasks providing info to the health endpoint to use
 *
 */
@CoverageIgnore
@Data
public abstract class ScheduledHealthInfo {
  private String lastRunTime;

  /**
   * The constructor
   */
  public ScheduledHealthInfo() {
    DateFormat dateTimeInstance = SimpleDateFormat.getDateTimeInstance();
    lastRunTime = dateTimeInstance.format(Calendar.getInstance().getTime());
  }
}
