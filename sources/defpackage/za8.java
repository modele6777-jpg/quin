package defpackage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class za8 implements xn7 {
    public static final za8 a = new za8();
    public static final DateTimeFormatter b = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
    public static final gia c = new gia("java.time.LocalDateTime", null, 0);

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        LocalDateTime localDateTime = (LocalDateTime) obj;
        localDateTime.getClass();
        String str = localDateTime.format(b);
        str.getClass();
        ev4Var.D(str);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        LocalDateTime localDateTime = LocalDateTime.parse(om3Var.u(), b);
        localDateTime.getClass();
        return localDateTime;
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return c;
    }
}
