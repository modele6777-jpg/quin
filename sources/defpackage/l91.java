package defpackage;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeParseException;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l91 extends j91 {
    public static final ZoneId e = ZoneId.of("UTC");
    public final int c;
    public final ArrayList d;

    public l91(Locale locale) {
        super(locale);
        this.c = WeekFields.of(locale).getFirstDayOfWeek().getValue();
        mx4 mx4Var = k91.a;
        ArrayList arrayList = new ArrayList(mx4Var.c());
        int iC = mx4Var.c();
        for (int i = 0; i < iC; i++) {
            DayOfWeek dayOfWeek = (DayOfWeek) mx4Var.get(i);
            arrayList.add(new iy9(dayOfWeek.getDisplayName(TextStyle.FULL_STANDALONE, locale), dayOfWeek.getDisplayName(TextStyle.NARROW_STANDALONE, locale)));
        }
        this.d = arrayList;
    }

    @Override // defpackage.j91
    public final n91 a(long j) {
        return e(Instant.ofEpochMilli(j).atZone(e).withDayOfMonth(1).toLocalDate());
    }

    @Override // defpackage.j91
    public final c91 b() {
        LocalDate localDateNow = LocalDate.now();
        return new c91(localDateNow.getYear(), localDateNow.getMonthValue(), localDateNow.getDayOfMonth(), localDateNow.atTime(LocalTime.MIDNIGHT).atZone(e).toInstant().toEpochMilli());
    }

    @Override // defpackage.j91
    public final c91 c(String str, String str2, Locale locale) {
        try {
            LocalDate localDate = LocalDate.parse(str, kj0.f0(str2, locale, this.b));
            return new c91(localDate.getYear(), localDate.getMonth().getValue(), localDate.getDayOfMonth(), localDate.atTime(LocalTime.MIDNIGHT).atZone(e).toInstant().toEpochMilli());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    public final c91 d(long j) {
        LocalDate localDate = Instant.ofEpochMilli(j).atZone(e).toLocalDate();
        return new c91(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), 1000 * localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC));
    }

    public final n91 e(LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - this.c;
        if (value < 0) {
            value += 7;
        }
        return new n91(localDate.atTime(LocalTime.MIDNIGHT).atZone(e).toInstant().toEpochMilli(), localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), value);
    }

    public final String toString() {
        return "CalendarModel";
    }
}
