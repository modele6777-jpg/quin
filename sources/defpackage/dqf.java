package defpackage;

import java.time.DateTimeException;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class dqf {
    public static final ace a = new ace(new ehf(27));
    public static final ace b = new ace(new ehf(28));
    public static final ace c = new ace(new ehf(29));

    public static final xpf a(Integer num, Integer num2, Integer num3) {
        try {
            if (num != null) {
                ZoneOffset zoneOffsetOfHoursMinutesSeconds = ZoneOffset.ofHoursMinutesSeconds(num.intValue(), num2 != null ? num2.intValue() : 0, num3 != null ? num3.intValue() : 0);
                zoneOffsetOfHoursMinutesSeconds.getClass();
                return new xpf(zoneOffsetOfHoursMinutesSeconds);
            }
            if (num2 != null) {
                ZoneOffset zoneOffsetOfHoursMinutesSeconds2 = ZoneOffset.ofHoursMinutesSeconds(num2.intValue() / 60, num2.intValue() % 60, num3 != null ? num3.intValue() : 0);
                zoneOffsetOfHoursMinutesSeconds2.getClass();
                return new xpf(zoneOffsetOfHoursMinutesSeconds2);
            }
            ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(num3 != null ? num3.intValue() : 0);
            zoneOffsetOfTotalSeconds.getClass();
            return new xpf(zoneOffsetOfTotalSeconds);
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static final xpf b(String str, DateTimeFormatter dateTimeFormatter) {
        try {
            return new xpf((ZoneOffset) dateTimeFormatter.parse(str, new cqf()));
        } catch (DateTimeException e) {
            throw new kg3(e);
        }
    }
}
