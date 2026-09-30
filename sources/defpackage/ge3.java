package defpackage;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ge3 extends gbe implements l26 {
    final /* synthetic */ j91 $calendarModel;
    final /* synthetic */ be3 $dateInputFormat;
    final /* synthetic */ Long $initialDateMillis;
    final /* synthetic */ Locale $locale;
    final /* synthetic */ e89 $text$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge3(Long l, j91 j91Var, be3 be3Var, Locale locale, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$initialDateMillis = l;
        this.$calendarModel = j91Var;
        this.$dateInputFormat = be3Var;
        this.$locale = locale;
        this.$text$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ge3(this.$initialDateMillis, this.$calendarModel, this.$dateInputFormat, this.$locale, this.$text$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        Long l = this.$initialDateMillis;
        if (l != null) {
            j91 j91Var = this.$calendarModel;
            be3 be3Var = this.$dateInputFormat;
            Locale locale = this.$locale;
            e89 e89Var = this.$text$delegate;
            long jLongValue = l.longValue();
            String str = be3Var.c;
            ZoneId zoneId = l91.e;
            String str2 = Instant.ofEpochMilli(jLongValue).atZone(l91.e).toLocalDate().format(kj0.f0(str, locale, ((l91) j91Var).b));
            zse zseVar = new zse(4, str2.length() == 0 ? eue.b : u3c.b(str2.length(), str2.length()), str2);
            bx9 bx9Var = he3.a;
            e89Var.setValue(zseVar);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ge3 ge3Var = (ge3) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        ge3Var.r(wefVar);
        return wefVar;
    }
}
