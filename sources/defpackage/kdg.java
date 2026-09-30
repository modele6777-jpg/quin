package defpackage;

import java.time.YearMonth;
import java.time.format.DateTimeParseException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kdg implements xn7 {
    public static final kdg a = new kdg();
    public static final hua b = eec.c("kotlinx.datetime.YearMonth");

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        bdg bdgVar = (bdg) obj;
        bdgVar.getClass();
        ev4Var.D(bdgVar.toString());
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        adg adgVar = bdg.Companion;
        String strU = om3Var.u();
        ace aceVar = idg.b;
        o1 o1Var = (o1) aceVar.getValue();
        adgVar.getClass();
        strU.getClass();
        o1Var.getClass();
        if (o1Var != ((o1) aceVar.getValue())) {
            return (bdg) o1Var.c(strU);
        }
        try {
            String string = strU.toString();
            string.getClass();
            return new bdg(YearMonth.parse(uyb.B(3, string)));
        } catch (DateTimeParseException e) {
            throw new kg3(e);
        }
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return b;
    }
}
