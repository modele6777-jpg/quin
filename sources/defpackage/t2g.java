package defpackage;

import android.util.Log;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t2g implements zhc {
    public static final vea k = i7h.B(new cwe(7), new ksf(18));
    public final vz9 a;
    public final vz9 b;
    public final vz9 c;
    public final vz9 d;
    public final vz9 e;
    public final mx3 f;
    public final id7 g;
    public final ec3 h;
    public final sz9 i;
    public final j18 j;

    public t2g(LocalDate localDate, LocalDate localDate2, LocalDate localDate3, DayOfWeek dayOfWeek, ryf ryfVar) {
        localDate.getClass();
        localDate2.getClass();
        localDate3.getClass();
        dayOfWeek.getClass();
        vz9 vz9VarF = q1c.f(localDate);
        this.a = vz9VarF;
        vz9 vz9VarF2 = q1c.f(localDate2);
        this.b = vz9VarF2;
        vz9 vz9VarF3 = q1c.f(localDate);
        this.c = vz9VarF3;
        vz9 vz9VarF4 = q1c.f(localDate2);
        this.d = vz9VarF4;
        vz9 vz9VarF5 = q1c.f(dayOfWeek);
        this.e = vz9VarF5;
        this.f = zrd.b(new ck6(this, 1));
        zrd.b(new ck6(this, 2));
        this.g = new id7();
        ec3 ec3Var = new ec3(new s2g(this, 1));
        this.h = ec3Var;
        sz9 sz9Var = new sz9(0);
        this.i = sz9Var;
        v2c.o((LocalDate) vz9VarF3.getValue(), (LocalDate) vz9VarF4.getValue());
        LocalDate localDate4 = (LocalDate) vz9VarF3.getValue();
        LocalDate localDate5 = (LocalDate) vz9VarF4.getValue();
        DayOfWeek dayOfWeek2 = (DayOfWeek) vz9VarF5.getValue();
        localDate4.getClass();
        localDate5.getClass();
        dayOfWeek2.getClass();
        DayOfWeek dayOfWeek3 = localDate4.getDayOfWeek();
        dayOfWeek3.getClass();
        LocalDate localDateMinusDays = localDate4.minusDays(((dayOfWeek3.ordinal() - dayOfWeek2.ordinal()) + 7) % 7);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        LocalDate localDatePlusDays = localDateMinusDays.plusWeeks((int) chronoUnit.between(localDateMinusDays, localDate5)).plusDays(6L);
        localDatePlusDays.getClass();
        vz9VarF.setValue(localDateMinusDays);
        vz9VarF2.setValue(localDatePlusDays);
        ec3Var.clear();
        LocalDate localDate6 = (LocalDate) vz9VarF.getValue();
        LocalDate localDate7 = (LocalDate) vz9VarF2.getValue();
        localDate6.getClass();
        localDate7.getClass();
        sz9Var.k(((int) chronoUnit.between(localDate6, localDate7)) + 1);
        if (ryfVar == null) {
            Integer numF = f(localDate3);
            ryfVar = new ryf(numF != null ? numF.intValue() : 0, 0);
        }
        this.j = new j18(ryfVar.a(), ryfVar.b());
    }

    @Override // defpackage.zhc
    public final boolean a() {
        return this.j.j.a();
    }

    @Override // defpackage.zhc
    public final Object b(s89 s89Var, l26 l26Var, zn2 zn2Var) {
        Object objB = this.j.b(s89Var, l26Var, zn2Var);
        return objB == bw2.a ? objB : wef.a;
    }

    @Override // defpackage.zhc
    public final boolean c() {
        return this.j.c();
    }

    @Override // defpackage.zhc
    public final boolean d() {
        return this.j.d();
    }

    @Override // defpackage.zhc
    public final float e(float f) {
        return this.j.j.e(f);
    }

    public final Integer f(LocalDate localDate) {
        vz9 vz9Var = this.a;
        LocalDate localDate2 = (LocalDate) vz9Var.getValue();
        if (localDate.compareTo(this.b.getValue()) <= 0 && localDate.compareTo((Object) localDate2) >= 0) {
            LocalDate localDate3 = (LocalDate) vz9Var.getValue();
            localDate3.getClass();
            return Integer.valueOf((int) ChronoUnit.WEEKS.between(localDate3, localDate));
        }
        Log.d("WeekCalendarState", "Attempting to scroll out of range; " + localDate);
        return null;
    }
}
