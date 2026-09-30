package org.ocpsoft.prettytime.i18n;

import defpackage.aye;
import defpackage.cr4;
import defpackage.mx2;
import defpackage.tec;
import defpackage.uxe;
import defpackage.vxe;
import defpackage.zq4;
import java.util.ListResourceBundle;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.concurrent.ConcurrentHashMap;
import org.ocpsoft.prettytime.units.Decade;
import org.ocpsoft.prettytime.units.Millennium;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class Resources_ja extends ListResourceBundle implements vxe {
    private static final Object[][] OBJECTS = {new Object[]{"CenturyPattern", "%n%u"}, new Object[]{"CenturyFuturePrefix", "今から"}, new Object[]{"CenturyFutureSuffix", "後"}, new Object[]{"CenturyPastPrefix", ""}, new Object[]{"CenturyPastSuffix", "前"}, new Object[]{"CenturySingularName", "世紀"}, new Object[]{"CenturyPluralName", "世紀"}, new Object[]{"DayPattern", "%n%u"}, new Object[]{"DayFuturePrefix", "今から"}, new Object[]{"DayFutureSuffix", "後"}, new Object[]{"DayPastPrefix", ""}, new Object[]{"DayPastSuffix", "前"}, new Object[]{"DaySingularName", "日"}, new Object[]{"DayPluralName", "日"}, new Object[]{"DecadePattern", "%n%u"}, new Object[]{"DecadeFuturePrefix", "今から"}, new Object[]{"DecadeFutureSuffix", "後"}, new Object[]{"DecadePastPrefix", ""}, new Object[]{"DecadePastSuffix", "前"}, new Object[]{"DecadeSingularName", "年"}, new Object[]{"DecadePluralName", "年"}, new Object[]{"HourPattern", "%n%u"}, new Object[]{"HourFuturePrefix", "今から"}, new Object[]{"HourFutureSuffix", "後"}, new Object[]{"HourPastPrefix", ""}, new Object[]{"HourPastSuffix", "前"}, new Object[]{"HourSingularName", "時間"}, new Object[]{"HourPluralName", "時間"}, new Object[]{"JustNowPattern", "%u"}, new Object[]{"JustNowFuturePrefix", "今から"}, new Object[]{"JustNowFutureSuffix", "すぐ"}, new Object[]{"JustNowPastPrefix", ""}, new Object[]{"JustNowPastSuffix", "たった今"}, new Object[]{"JustNowSingularName", ""}, new Object[]{"JustNowPluralName", ""}, new Object[]{"MillenniumPattern", "%n%u"}, new Object[]{"MillenniumFuturePrefix", "今から"}, new Object[]{"MillenniumFutureSuffix", "後"}, new Object[]{"MillenniumPastPrefix", ""}, new Object[]{"MillenniumPastSuffix", "前"}, new Object[]{"MillenniumSingularName", "年"}, new Object[]{"MillenniumPluralName", "年"}, new Object[]{"MillisecondPattern", "%n%u"}, new Object[]{"MillisecondFuturePrefix", "今から"}, new Object[]{"MillisecondFutureSuffix", "後"}, new Object[]{"MillisecondPastPrefix", ""}, new Object[]{"MillisecondPastSuffix", "前"}, new Object[]{"MillisecondSingularName", "ミリ秒"}, new Object[]{"MillisecondPluralName", "ミリ秒"}, new Object[]{"MinutePattern", "%n%u"}, new Object[]{"MinuteFuturePrefix", "今から"}, new Object[]{"MinuteFutureSuffix", "後"}, new Object[]{"MinutePastPrefix", ""}, new Object[]{"MinutePastSuffix", "前"}, new Object[]{"MinuteSingularName", "分"}, new Object[]{"MinutePluralName", "分"}, new Object[]{"MonthPattern", "%n%u"}, new Object[]{"MonthFuturePrefix", "今から"}, new Object[]{"MonthFutureSuffix", "後"}, new Object[]{"MonthPastPrefix", ""}, new Object[]{"MonthPastSuffix", "前"}, new Object[]{"MonthSingularName", "ヶ月"}, new Object[]{"MonthPluralName", "ヶ月"}, new Object[]{"SecondPattern", "%n%u"}, new Object[]{"SecondFuturePrefix", "今から"}, new Object[]{"SecondFutureSuffix", "後"}, new Object[]{"SecondPastPrefix", ""}, new Object[]{"SecondPastSuffix", "前"}, new Object[]{"SecondSingularName", "秒"}, new Object[]{"SecondPluralName", "秒"}, new Object[]{"WeekPattern", "%n%u"}, new Object[]{"WeekFuturePrefix", "今から"}, new Object[]{"WeekFutureSuffix", "後"}, new Object[]{"WeekPastPrefix", ""}, new Object[]{"WeekPastSuffix", "前"}, new Object[]{"WeekSingularName", "週間"}, new Object[]{"WeekPluralName", "週間"}, new Object[]{"YearPattern", "%n%u"}, new Object[]{"YearFuturePrefix", "今から"}, new Object[]{"YearFutureSuffix", "後"}, new Object[]{"YearPastPrefix", ""}, new Object[]{"YearPastSuffix", "前"}, new Object[]{"YearSingularName", "年"}, new Object[]{"YearPluralName", "年"}, new Object[]{"AbstractTimeUnitPattern", ""}, new Object[]{"AbstractTimeUnitFuturePrefix", ""}, new Object[]{"AbstractTimeUnitFutureSuffix", ""}, new Object[]{"AbstractTimeUnitPastPrefix", ""}, new Object[]{"AbstractTimeUnitPastSuffix", ""}, new Object[]{"AbstractTimeUnitSingularName", ""}, new Object[]{"AbstractTimeUnitPluralName", ""}};
    private final Map<aye, uxe> formatMap = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ uxe lambda$getFormatFor$0(aye ayeVar) {
        return new JaTimeFormat(this, ayeVar);
    }

    @Override // java.util.ListResourceBundle
    public Object[][] getContents() {
        return OBJECTS;
    }

    @Override // defpackage.vxe
    public uxe getFormatFor(aye ayeVar) {
        return this.formatMap.computeIfAbsent(ayeVar, new mx2(2, this));
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static class JaTimeFormat implements uxe {
        private static final String NEGATIVE = "-";
        public static final String QUANTITY = "%n";
        public static final String SIGN = "%s";
        public static final String UNIT = "%u";
        private String singularName = "";
        private String pluralName = "";
        private String futureSingularName = "";
        private String futurePluralName = "";
        private String pastSingularName = "";
        private String pastPluralName = "";
        private String pattern = "";
        private String futurePrefix = "";
        private String futureSuffix = "";
        private String pastPrefix = "";
        private String pastSuffix = "";
        private int roundingTolerance = 50;

        public JaTimeFormat(ResourceBundle resourceBundle, aye ayeVar) {
            setPattern(resourceBundle.getString(getUnitName(ayeVar) + "Pattern"));
            setFuturePrefix(resourceBundle.getString(getUnitName(ayeVar) + "FuturePrefix"));
            setFutureSuffix(resourceBundle.getString(getUnitName(ayeVar) + "FutureSuffix"));
            setPastPrefix(resourceBundle.getString(getUnitName(ayeVar) + "PastPrefix"));
            setPastSuffix(resourceBundle.getString(getUnitName(ayeVar) + "PastSuffix"));
            setSingularName(resourceBundle.getString(getUnitName(ayeVar) + "SingularName"));
            setPluralName(resourceBundle.getString(getUnitName(ayeVar) + "PluralName"));
            try {
                setFuturePluralName(resourceBundle.getString(getUnitName(ayeVar) + "FuturePluralName"));
            } catch (Exception unused) {
            }
            try {
                setFutureSingularName(resourceBundle.getString(getUnitName(ayeVar) + "FutureSingularName"));
            } catch (Exception unused2) {
            }
            try {
                setPastPluralName(resourceBundle.getString(getUnitName(ayeVar) + "PastPluralName"));
            } catch (Exception unused3) {
            }
            try {
                setPastSingularName(resourceBundle.getString(getUnitName(ayeVar) + "PastSingularName"));
            } catch (Exception unused4) {
            }
        }

        private String applyPattern(String str, String str2, long j) {
            return getPattern(j).replaceAll("%s", str).replaceAll("%n", String.valueOf(j)).replaceAll("%u", str2);
        }

        private String format(zq4 zq4Var, boolean z) {
            String sign = getSign(zq4Var);
            String gramaticallyCorrectName = getGramaticallyCorrectName(zq4Var, z);
            long quantity = getQuantity(zq4Var, z);
            if (((cr4) zq4Var).c instanceof Decade) {
                quantity *= 10;
            }
            if (((cr4) zq4Var).c instanceof Millennium) {
                quantity *= 1000;
            }
            return applyPattern(sign, gramaticallyCorrectName, quantity);
        }

        private String getPluralName(zq4 zq4Var) {
            cr4 cr4Var = (cr4) zq4Var;
            if (!cr4Var.b() || this.futurePluralName == null || this.futureSingularName.length() <= 0) {
                return (!cr4Var.c() || this.pastPluralName == null || this.pastSingularName.length() <= 0) ? this.pluralName : this.pastPluralName;
            }
            return this.futurePluralName;
        }

        private String getSign(zq4 zq4Var) {
            return ((cr4) zq4Var).a < 0 ? NEGATIVE : "";
        }

        private String getSingularName(zq4 zq4Var) {
            String str;
            String str2;
            cr4 cr4Var = (cr4) zq4Var;
            if (!cr4Var.b() || (str2 = this.futureSingularName) == null || str2.length() <= 0) {
                return (!cr4Var.c() || (str = this.pastSingularName) == null || str.length() <= 0) ? this.singularName : this.pastSingularName;
            }
            return this.futureSingularName;
        }

        private String getUnitName(aye ayeVar) {
            return ayeVar.getClass().getSimpleName();
        }

        @Override // defpackage.uxe
        public String decorate(zq4 zq4Var, String str) {
            StringBuilder sb = new StringBuilder();
            if (((cr4) zq4Var).c()) {
                sb.append(this.pastPrefix);
                sb.append(str);
                sb.append(this.pastSuffix);
            } else {
                sb.append(this.futurePrefix);
                sb.append(str);
                sb.append(this.futureSuffix);
            }
            return sb.toString().replaceAll("\\s+", " ").trim();
        }

        @Override // defpackage.uxe
        public String decorateUnrounded(zq4 zq4Var, String str) {
            return decorate(zq4Var, str);
        }

        @Override // defpackage.uxe
        public String formatUnrounded(zq4 zq4Var) {
            return format(zq4Var, false);
        }

        public String getGramaticallyCorrectName(zq4 zq4Var, boolean z) {
            return (Math.abs(getQuantity(zq4Var, z)) == 0 || Math.abs(getQuantity(zq4Var, z)) > 1) ? getPluralName(zq4Var) : getSingularName(zq4Var);
        }

        public String getPattern(long j) {
            return this.pattern;
        }

        public long getQuantity(zq4 zq4Var, boolean z) {
            long jA;
            if (z) {
                jA = ((cr4) zq4Var).a(this.roundingTolerance);
            } else {
                jA = ((cr4) zq4Var).a;
            }
            return Math.abs(jA);
        }

        public JaTimeFormat setFuturePluralName(String str) {
            this.futurePluralName = str;
            return this;
        }

        public JaTimeFormat setFuturePrefix(String str) {
            this.futurePrefix = str.trim();
            return this;
        }

        public JaTimeFormat setFutureSingularName(String str) {
            this.futureSingularName = str;
            return this;
        }

        public JaTimeFormat setFutureSuffix(String str) {
            this.futureSuffix = str.trim();
            return this;
        }

        public JaTimeFormat setPastPluralName(String str) {
            this.pastPluralName = str;
            return this;
        }

        public JaTimeFormat setPastPrefix(String str) {
            this.pastPrefix = str.trim();
            return this;
        }

        public JaTimeFormat setPastSingularName(String str) {
            this.pastSingularName = str;
            return this;
        }

        public JaTimeFormat setPastSuffix(String str) {
            this.pastSuffix = str.trim();
            return this;
        }

        public JaTimeFormat setPattern(String str) {
            this.pattern = str;
            return this;
        }

        public JaTimeFormat setPluralName(String str) {
            this.pluralName = str;
            return this;
        }

        public JaTimeFormat setSingularName(String str) {
            this.singularName = str;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("JaTimeFormat [pattern=");
            sb.append(this.pattern);
            sb.append(", futurePrefix=");
            sb.append(this.futurePrefix);
            sb.append(", futureSuffix=");
            sb.append(this.futureSuffix);
            sb.append(", pastPrefix=");
            sb.append(this.pastPrefix);
            sb.append(", pastSuffix=");
            sb.append(this.pastSuffix);
            sb.append(", roundingTolerance=");
            return tec.g(this.roundingTolerance, "]", sb);
        }

        @Override // defpackage.uxe
        public String format(zq4 zq4Var) {
            return format(zq4Var, true);
        }
    }
}
