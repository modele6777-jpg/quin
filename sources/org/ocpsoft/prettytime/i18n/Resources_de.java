package org.ocpsoft.prettytime.i18n;

import defpackage.aye;
import defpackage.sjd;
import defpackage.tec;
import defpackage.uxe;
import defpackage.vxe;
import defpackage.zq4;
import java.util.ListResourceBundle;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class Resources_de extends ListResourceBundle implements vxe {
    private static final Object[][] OBJECTS = {new Object[]{"CenturyPattern", "%n %u"}, new Object[]{"CenturyFuturePrefix", "in "}, new Object[]{"CenturyFutureSuffix", ""}, new Object[]{"CenturyPastPrefix", "vor "}, new Object[]{"CenturyPastSuffix", ""}, new Object[]{"CenturySingularName", "Jahrhundert"}, new Object[]{"CenturyPluralName", "Jahrhunderte"}, new Object[]{"DayPattern", "%n %u"}, new Object[]{"DayFuturePrefix", "in "}, new Object[]{"DayFutureSuffix", ""}, new Object[]{"DayPastPrefix", "vor "}, new Object[]{"DayPastSuffix", ""}, new Object[]{"DaySingularName", "Tag"}, new Object[]{"DayPluralName", "Tage"}, new Object[]{"DecadePattern", "%n %u"}, new Object[]{"DecadeFuturePrefix", "in "}, new Object[]{"DecadeFutureSuffix", ""}, new Object[]{"DecadePastPrefix", "vor "}, new Object[]{"DecadePastSuffix", ""}, new Object[]{"DecadeSingularName", "Jahrzehnt"}, new Object[]{"DecadePluralName", "Jahrzehnte"}, new Object[]{"HourPattern", "%n %u"}, new Object[]{"HourFuturePrefix", "in "}, new Object[]{"HourFutureSuffix", ""}, new Object[]{"HourPastPrefix", "vor "}, new Object[]{"HourPastSuffix", ""}, new Object[]{"HourSingularName", "Stunde"}, new Object[]{"HourPluralName", "Stunden"}, new Object[]{"JustNowPattern", "%u"}, new Object[]{"JustNowFuturePrefix", "Jetzt"}, new Object[]{"JustNowFutureSuffix", ""}, new Object[]{"JustNowPastPrefix", "gerade eben"}, new Object[]{"JustNowPastSuffix", ""}, new Object[]{"JustNowSingularName", ""}, new Object[]{"JustNowPluralName", ""}, new Object[]{"MillenniumPattern", "%n %u"}, new Object[]{"MillenniumFuturePrefix", "in "}, new Object[]{"MillenniumFutureSuffix", ""}, new Object[]{"MillenniumPastPrefix", "vor "}, new Object[]{"MillenniumPastSuffix", ""}, new Object[]{"MillenniumSingularName", "Jahrtausend"}, new Object[]{"MillenniumPluralName", "Jahrtausende"}, new Object[]{"MillisecondPattern", "%n %u"}, new Object[]{"MillisecondFuturePrefix", "in "}, new Object[]{"MillisecondFutureSuffix", ""}, new Object[]{"MillisecondPastPrefix", "vor "}, new Object[]{"MillisecondPastSuffix", ""}, new Object[]{"MillisecondSingularName", "Millisekunde"}, new Object[]{"MillisecondPluralName", "Millisekunden"}, new Object[]{"MinutePattern", "%n %u"}, new Object[]{"MinuteFuturePrefix", "in "}, new Object[]{"MinuteFutureSuffix", ""}, new Object[]{"MinutePastPrefix", "vor "}, new Object[]{"MinutePastSuffix", ""}, new Object[]{"MinuteSingularName", "Minute"}, new Object[]{"MinutePluralName", "Minuten"}, new Object[]{"MonthPattern", "%n %u"}, new Object[]{"MonthFuturePrefix", "in "}, new Object[]{"MonthFutureSuffix", ""}, new Object[]{"MonthPastPrefix", "vor "}, new Object[]{"MonthPastSuffix", ""}, new Object[]{"MonthSingularName", "Monat"}, new Object[]{"MonthPluralName", "Monate"}, new Object[]{"SecondPattern", "%n %u"}, new Object[]{"SecondFuturePrefix", "in "}, new Object[]{"SecondFutureSuffix", ""}, new Object[]{"SecondPastPrefix", "vor "}, new Object[]{"SecondPastSuffix", ""}, new Object[]{"SecondSingularName", "Sekunde"}, new Object[]{"SecondPluralName", "Sekunden"}, new Object[]{"WeekPattern", "%n %u"}, new Object[]{"WeekFuturePrefix", "in "}, new Object[]{"WeekFutureSuffix", ""}, new Object[]{"WeekPastPrefix", "vor "}, new Object[]{"WeekPastSuffix", ""}, new Object[]{"WeekSingularName", "Woche"}, new Object[]{"WeekPluralName", "Wochen"}, new Object[]{"YearPattern", "%n %u"}, new Object[]{"YearFuturePrefix", "in "}, new Object[]{"YearFutureSuffix", ""}, new Object[]{"YearPastPrefix", "vor "}, new Object[]{"YearPastSuffix", ""}, new Object[]{"YearSingularName", "Jahr"}, new Object[]{"YearPluralName", "Jahre"}, new Object[]{"AbstractTimeUnitPattern", ""}, new Object[]{"AbstractTimeUnitFuturePrefix", ""}, new Object[]{"AbstractTimeUnitFutureSuffix", ""}, new Object[]{"AbstractTimeUnitPastPrefix", ""}, new Object[]{"AbstractTimeUnitPastSuffix", ""}, new Object[]{"AbstractTimeUnitSingularName", ""}, new Object[]{"AbstractTimeUnitPluralName", ""}};

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static class DeTimeFormat extends sjd {
        private static final Pattern grammerReplacementPattern;
        private static final Map<String, String> unitsToAdjust;

        static {
            Map<String, String> map = (Map) Stream.of((Object[]) new String[]{"Jahrtausende", "Jahrhunderte", "Jahrzehnte", "Jahre", "Monate", "Tage"}).collect(Collectors.toMap(Function.identity(), new a()));
            unitsToAdjust = map;
            grammerReplacementPattern = Pattern.compile("\\b(" + String.join("|", map.keySet()) + ")\\b");
        }

        public DeTimeFormat(ResourceBundle resourceBundle, aye ayeVar) {
            String simpleName = ayeVar.getClass().getSimpleName();
            setPattern(resourceBundle.getString(simpleName.concat("Pattern")));
            setFuturePrefix(resourceBundle.getString(simpleName.concat("FuturePrefix")));
            setFutureSuffix(resourceBundle.getString(simpleName.concat("FutureSuffix")));
            setPastPrefix(resourceBundle.getString(simpleName.concat("PastPrefix")));
            setPastSuffix(resourceBundle.getString(simpleName.concat("PastSuffix")));
            setSingularName(resourceBundle.getString(simpleName.concat("SingularName")));
            setPluralName(resourceBundle.getString(simpleName.concat("PluralName")));
        }

        private String adjustGrammar(String str) {
            Matcher matcher = grammerReplacementPattern.matcher(str);
            StringBuffer stringBuffer = new StringBuffer();
            while (matcher.find()) {
                matcher.appendReplacement(stringBuffer, unitsToAdjust.get(matcher.group(1)));
            }
            matcher.appendTail(stringBuffer);
            return stringBuffer.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$static$0(String str) {
            return tec.l(str, "n");
        }

        @Override // defpackage.sjd, defpackage.uxe
        public String decorate(zq4 zq4Var, String str) {
            return super.decorate(zq4Var, adjustGrammar(str));
        }

        @Override // defpackage.sjd, defpackage.uxe
        public String decorateUnrounded(zq4 zq4Var, String str) {
            return super.decorateUnrounded(zq4Var, adjustGrammar(str));
        }
    }

    @Override // java.util.ListResourceBundle
    public Object[][] getContents() {
        return OBJECTS;
    }

    @Override // defpackage.vxe
    public uxe getFormatFor(aye ayeVar) {
        return new DeTimeFormat(this, ayeVar);
    }
}
