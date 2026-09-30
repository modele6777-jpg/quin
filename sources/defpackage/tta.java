package defpackage;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;
import org.ocpsoft.prettytime.units.Century;
import org.ocpsoft.prettytime.units.Day;
import org.ocpsoft.prettytime.units.Decade;
import org.ocpsoft.prettytime.units.Hour;
import org.ocpsoft.prettytime.units.JustNow;
import org.ocpsoft.prettytime.units.Millennium;
import org.ocpsoft.prettytime.units.Millisecond;
import org.ocpsoft.prettytime.units.Minute;
import org.ocpsoft.prettytime.units.Month;
import org.ocpsoft.prettytime.units.Second;
import org.ocpsoft.prettytime.units.Week;
import org.ocpsoft.prettytime.units.Year;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tta {
    public volatile Locale a = Locale.getDefault();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public volatile List c;

    public tta() {
        JustNow justNow = new JustNow();
        justNow.b = 60000L;
        a(justNow);
        Millisecond millisecond = new Millisecond();
        millisecond.c = 1L;
        a(millisecond);
        Second second = new Second();
        second.c = 1000L;
        a(second);
        Minute minute = new Minute();
        minute.c = 60000L;
        a(minute);
        Hour hour = new Hour();
        hour.c = 3600000L;
        a(hour);
        Day day = new Day();
        day.c = 86400000L;
        a(day);
        Week week = new Week();
        week.c = 604800000L;
        a(week);
        Month month = new Month();
        month.c = 2629743830L;
        a(month);
        Year year = new Year();
        year.c = 31556925960L;
        a(year);
        Decade decade = new Decade();
        decade.c = 315569259747L;
        a(decade);
        Century century = new Century();
        century.c = 3155692597470L;
        a(century);
        Millennium millennium = new Millennium();
        millennium.c = 31556926000000L;
        a(millennium);
    }

    public final void a(ResourcesTimeUnit resourcesTimeUnit) {
        iyb iybVar = new iyb(resourcesTimeUnit);
        this.c = null;
        this.b.put(resourcesTimeUnit, iybVar);
        iybVar.b(this.a);
    }

    public final cr4 b(Date date) {
        long time = (date == null ? new Date() : date).getTime() - Instant.now().toEpochMilli();
        long j = 0;
        if (time == 0) {
            time = 1;
        }
        long jAbs = Math.abs(time);
        if (this.c == null) {
            ArrayList arrayList = new ArrayList(this.b.keySet());
            Collections.sort(arrayList, Comparator.comparing(new fj0(8)));
            this.c = Collections.unmodifiableList(arrayList);
        }
        List list = this.c;
        cr4 cr4Var = new cr4();
        int i = 0;
        while (i < list.size()) {
            aye ayeVar = (aye) list.get(i);
            long jAbs2 = Math.abs(((ResourcesTimeUnit) ayeVar).c);
            ResourcesTimeUnit resourcesTimeUnit = (ResourcesTimeUnit) ayeVar;
            long jAbs3 = Math.abs(resourcesTimeUnit.b);
            boolean z = i == list.size() + (-1);
            if (j == jAbs3 && !z) {
                jAbs3 = ((ResourcesTimeUnit) ((aye) list.get(i + 1))).c / resourcesTimeUnit.c;
            }
            if (jAbs3 * jAbs2 > jAbs || z) {
                cr4Var.c = ayeVar;
                if (jAbs2 <= jAbs) {
                    long j2 = time / jAbs2;
                    cr4Var.a = j2;
                    cr4Var.b = time - (j2 * jAbs2);
                    break;
                }
                cr4Var.a = j > time ? -1L : 1L;
                cr4Var.b = j;
                return cr4Var;
            }
            i++;
            j = j;
        }
        return cr4Var;
    }

    public final String c(cr4 cr4Var) {
        uxe uxeVar;
        aye ayeVar = cr4Var.c;
        if (ayeVar == null) {
            uxeVar = null;
        } else {
            ConcurrentHashMap concurrentHashMap = this.b;
            if (concurrentHashMap.get(ayeVar) != null) {
                uxeVar = (uxe) concurrentHashMap.get(ayeVar);
            } else {
                ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                concurrentHashMap.keySet().forEach(new sta(this, concurrentHashMap2, 0));
                uxeVar = (uxe) concurrentHashMap2.get(ayeVar.toString());
            }
        }
        return uxeVar.decorate(cr4Var, uxeVar.format(cr4Var));
    }

    public final String toString() {
        return "PrettyTime [reference=null, locale=" + this.a + "]";
    }
}
