package org.ocpsoft.prettytime.i18n;

import defpackage.aye;
import defpackage.cr4;
import defpackage.mx2;
import defpackage.sjd;
import defpackage.uxe;
import defpackage.vxe;
import defpackage.zq4;
import java.util.ListResourceBundle;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.concurrent.ConcurrentHashMap;
import org.ocpsoft.prettytime.units.Day;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class Resources_fi extends ListResourceBundle implements vxe {
    private static Object[][] CONTENTS = {new Object[]{"JustNowPattern", "%u"}, new Object[]{"JustNowPastSingularName", "hetki"}, new Object[]{"JustNowFutureSingularName", "hetken"}, new Object[]{"JustNowPastSuffix", "sitten"}, new Object[]{"JustNowFutureSuffix", "päästä"}, new Object[]{"MillisecondPattern", "%u"}, new Object[]{"MillisecondPluralPattern", "%n %u"}, new Object[]{"MillisecondPastSingularName", "millisekunti"}, new Object[]{"MillisecondPastPluralName", "millisekuntia"}, new Object[]{"MillisecondFutureSingularName", "millisekunnin"}, new Object[]{"MillisecondPastSuffix", "sitten"}, new Object[]{"MillisecondFutureSuffix", "päästä"}, new Object[]{"SecondPattern", "%u"}, new Object[]{"SecondPluralPattern", "%n %u"}, new Object[]{"SecondPastSingularName", "sekunti"}, new Object[]{"SecondPastPluralName", "sekuntia"}, new Object[]{"SecondFutureSingularName", "sekunnin"}, new Object[]{"SecondPastSuffix", "sitten"}, new Object[]{"SecondFutureSuffix", "päästä"}, new Object[]{"MinutePattern", "%u"}, new Object[]{"MinutePluralPattern", "%n %u"}, new Object[]{"MinutePastSingularName", "minuutti"}, new Object[]{"MinutePastPluralName", "minuuttia"}, new Object[]{"MinuteFutureSingularName", "minuutin"}, new Object[]{"MinutePastSuffix", "sitten"}, new Object[]{"MinuteFutureSuffix", "päästä"}, new Object[]{"HourPattern", "%u"}, new Object[]{"HourPluralPattern", "%n %u"}, new Object[]{"HourPastSingularName", "tunti"}, new Object[]{"HourPastPluralName", "tuntia"}, new Object[]{"HourFutureSingularName", "tunnin"}, new Object[]{"HourPastSuffix", "sitten"}, new Object[]{"HourFutureSuffix", "päästä"}, new Object[]{"DayPattern", "%u"}, new Object[]{"DayPluralPattern", "%n %u"}, new Object[]{"DayPastSingularName", "eilen"}, new Object[]{"DayPastPluralName", "päivää"}, new Object[]{"DayFutureSingularName", "huomenna"}, new Object[]{"DayFuturePluralName", "päivän"}, new Object[]{"DayPastSuffix", "sitten"}, new Object[]{"DayFutureSuffix", "päästä"}, new Object[]{"WeekPattern", "%u"}, new Object[]{"WeekPluralPattern", "%n %u"}, new Object[]{"WeekPastSingularName", "viikko"}, new Object[]{"WeekPastPluralName", "viikkoa"}, new Object[]{"WeekFutureSingularName", "viikon"}, new Object[]{"WeekFuturePluralName", "viikon"}, new Object[]{"WeekPastSuffix", "sitten"}, new Object[]{"WeekFutureSuffix", "päästä"}, new Object[]{"MonthPattern", "%u"}, new Object[]{"MonthPluralPattern", "%n %u"}, new Object[]{"MonthPastSingularName", "kuukausi"}, new Object[]{"MonthPastPluralName", "kuukautta"}, new Object[]{"MonthFutureSingularName", "kuukauden"}, new Object[]{"MonthPastSuffix", "sitten"}, new Object[]{"MonthFutureSuffix", "päästä"}, new Object[]{"YearPattern", "%u"}, new Object[]{"YearPluralPattern", "%n %u"}, new Object[]{"YearPastSingularName", "vuosi"}, new Object[]{"YearPastPluralName", "vuotta"}, new Object[]{"YearFutureSingularName", "vuoden"}, new Object[]{"YearPastSuffix", "sitten"}, new Object[]{"YearFutureSuffix", "päästä"}, new Object[]{"DecadePattern", "%u"}, new Object[]{"DecadePluralPattern", "%n %u"}, new Object[]{"DecadePastSingularName", "vuosikymmen"}, new Object[]{"DecadePastPluralName", "vuosikymmentä"}, new Object[]{"DecadeFutureSingularName", "vuosikymmenen"}, new Object[]{"DecadePastSuffix", "sitten"}, new Object[]{"DecadeFutureSuffix", "päästä"}, new Object[]{"CenturyPattern", "%u"}, new Object[]{"CenturyPluralPattern", "%n %u"}, new Object[]{"CenturyPastSingularName", "vuosisata"}, new Object[]{"CenturyPastPluralName", "vuosisataa"}, new Object[]{"CenturyFutureSingularName", "vuosisadan"}, new Object[]{"CenturyPastSuffix", "sitten"}, new Object[]{"CenturyFutureSuffix", "päästä"}, new Object[]{"MillenniumPattern", "%u"}, new Object[]{"MillenniumPluralPattern", "%n %u"}, new Object[]{"MillenniumPastSingularName", "vuosituhat"}, new Object[]{"MillenniumPastPluralName", "vuosituhatta"}, new Object[]{"MillenniumFutureSingularName", "vuosituhannen"}, new Object[]{"MillenniumPastSuffix", "sitten"}, new Object[]{"MillenniumFutureSuffix", "päästä"}};
    private static final int tolerance = 50;
    private final Map<aye, uxe> formatMap = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ uxe lambda$getFormatFor$0(aye ayeVar) {
        return new FiTimeFormat(this, ayeVar);
    }

    @Override // java.util.ListResourceBundle
    public Object[][] getContents() {
        return CONTENTS;
    }

    @Override // defpackage.vxe
    public uxe getFormatFor(aye ayeVar) {
        return this.formatMap.computeIfAbsent(ayeVar, new mx2(1, this));
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static class FiTimeFormat extends sjd {
        private final ResourceBundle bundle;
        private String pastName = "";
        private String futureName = "";
        private String pastPluralName = "";
        private String futurePluralName = "";
        private String pluralPattern = "";

        public FiTimeFormat(ResourceBundle resourceBundle, aye ayeVar) {
            this.bundle = resourceBundle;
            if (resourceBundle.containsKey(getUnitName(ayeVar) + "PastSingularName")) {
                setPastName(resourceBundle.getString(getUnitName(ayeVar) + "PastSingularName")).setFutureName(resourceBundle.getString(getUnitName(ayeVar) + "FutureSingularName")).setPastPluralName(resourceBundle.getString(getUnitName(ayeVar) + "PastSingularName")).setFuturePluralName(resourceBundle.getString(getUnitName(ayeVar) + "FutureSingularName")).setPluralPattern(resourceBundle.getString(getUnitName(ayeVar) + "Pattern"));
                if (resourceBundle.containsKey(getUnitName(ayeVar) + "PastPluralName")) {
                    setPastPluralName(resourceBundle.getString(getUnitName(ayeVar) + "PastPluralName"));
                }
                if (resourceBundle.containsKey(getUnitName(ayeVar) + "FuturePluralName")) {
                    setFuturePluralName(resourceBundle.getString(getUnitName(ayeVar) + "FuturePluralName"));
                }
                if (resourceBundle.containsKey(getUnitName(ayeVar) + "PluralPattern")) {
                    setPluralPattern(resourceBundle.getString(getUnitName(ayeVar) + "PluralPattern"));
                }
                setPattern(resourceBundle.getString(getUnitName(ayeVar) + "Pattern")).setPastSuffix(resourceBundle.getString(getUnitName(ayeVar) + "PastSuffix")).setFutureSuffix(resourceBundle.getString(getUnitName(ayeVar) + "FutureSuffix")).setFuturePrefix("").setPastPrefix("").setSingularName("").setPluralName("");
            }
        }

        private String getUnitName(aye ayeVar) {
            return ayeVar.getClass().getSimpleName();
        }

        @Override // defpackage.sjd, defpackage.uxe
        public String decorate(zq4 zq4Var, String str) {
            return ((((cr4) zq4Var).c instanceof Day) && Math.abs(((cr4) zq4Var).a(Resources_fi.tolerance)) == 1) ? str : super.decorate(zq4Var, str);
        }

        public String getFutureName() {
            return this.futureName;
        }

        public String getFuturePluralName() {
            return this.futurePluralName;
        }

        @Override // defpackage.sjd
        public String getGramaticallyCorrectName(zq4 zq4Var, boolean z) {
            cr4 cr4Var = (cr4) zq4Var;
            String pastName = cr4Var.c() ? getPastName() : getFutureName();
            if (Math.abs(getQuantity(cr4Var, z)) == 0 || Math.abs(getQuantity(cr4Var, z)) > 1) {
                return cr4Var.c() ? getPastPluralName() : getFuturePluralName();
            }
            return pastName;
        }

        public String getPastName() {
            return this.pastName;
        }

        public String getPastPluralName() {
            return this.pastPluralName;
        }

        @Override // defpackage.sjd
        public String getPattern(long j) {
            return Math.abs(j) == 1 ? getPattern() : getPluralPattern();
        }

        public String getPluralPattern() {
            return this.pluralPattern;
        }

        public FiTimeFormat setFutureName(String str) {
            this.futureName = str;
            return this;
        }

        public FiTimeFormat setPastName(String str) {
            this.pastName = str;
            return this;
        }

        public FiTimeFormat setPluralPattern(String str) {
            this.pluralPattern = str;
            return this;
        }

        @Override // defpackage.sjd
        public FiTimeFormat setFuturePluralName(String str) {
            this.futurePluralName = str;
            return this;
        }

        @Override // defpackage.sjd
        public FiTimeFormat setPastPluralName(String str) {
            this.pastPluralName = str;
            return this;
        }
    }
}
