package defpackage;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jl9 implements xn7 {
    public static final jl9 a = new jl9();
    public static final hua b = eec.c("OffsetDateTime");

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        offsetDateTime.getClass();
        String str = offsetDateTime.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        str.getClass();
        ev4Var.D(str);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(om3Var.u(), DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        offsetDateTime.getClass();
        return offsetDateTime;
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return b;
    }
}
