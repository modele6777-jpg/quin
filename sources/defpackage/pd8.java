package defpackage;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pd8 implements xn7 {
    public static final pd8 a = new pd8();
    public static final hua b = eec.c("kotlinx.datetime.LocalTime");

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        kd8 kd8Var = (kd8) obj;
        kd8Var.getClass();
        ev4Var.D(kd8Var.toString());
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        jd8 jd8Var = kd8.Companion;
        String strU = om3Var.u();
        ace aceVar = od8.a;
        md8 md8Var = (md8) aceVar.getValue();
        jd8Var.getClass();
        strU.getClass();
        md8Var.getClass();
        if (md8Var != ((md8) aceVar.getValue())) {
            return (kd8) md8Var.c(strU);
        }
        try {
            return new kd8(LocalTime.parse(strU));
        } catch (DateTimeParseException e) {
            throw new kg3(e);
        }
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return b;
    }
}
