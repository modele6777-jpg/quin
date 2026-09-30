package defpackage;

import java.time.format.DateTimeFormatter;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gqf implements xn7 {
    public static final gqf a = new gqf();
    public static final hua b = eec.c("kotlinx.datetime.UtcOffset");

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        xpf xpfVar = (xpf) obj;
        xpfVar.getClass();
        ev4Var.D(xpfVar.toString());
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        wpf wpfVar = xpf.Companion;
        String strU = om3Var.u();
        ace aceVar = bqf.a;
        aqf aqfVar = (aqf) aceVar.getValue();
        wpfVar.getClass();
        strU.getClass();
        aqfVar.getClass();
        if (aqfVar == ((aqf) aceVar.getValue())) {
            DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) dqf.a.getValue();
            dateTimeFormatter.getClass();
            return dqf.b(strU, dateTimeFormatter);
        }
        if (aqfVar == ((aqf) bqf.b.getValue())) {
            DateTimeFormatter dateTimeFormatter2 = (DateTimeFormatter) dqf.b.getValue();
            dateTimeFormatter2.getClass();
            return dqf.b(strU, dateTimeFormatter2);
        }
        if (aqfVar != ((aqf) bqf.c.getValue())) {
            return (xpf) aqfVar.c(strU);
        }
        DateTimeFormatter dateTimeFormatter3 = (DateTimeFormatter) dqf.c.getValue();
        dateTimeFormatter3.getClass();
        return dqf.b(strU, dateTimeFormatter3);
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return b;
    }
}
