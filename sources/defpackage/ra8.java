package defpackage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ra8 implements xn7 {
    public static final ra8 a = new ra8();
    public static final hua b = eec.c("LocalDate");

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        LocalDate localDate = (LocalDate) obj;
        localDate.getClass();
        String str = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        str.getClass();
        ev4Var.D(str);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        LocalDate localDate = LocalDate.parse(om3Var.u(), DateTimeFormatter.ISO_LOCAL_DATE);
        localDate.getClass();
        return localDate;
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return b;
    }
}
