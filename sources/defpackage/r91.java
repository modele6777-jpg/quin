package defpackage;

import android.util.Log;
import java.time.DayOfWeek;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r91 implements zhc {
    public static final vea j = i7h.B(new ym0(1), new wu0(10));
    public final vz9 a;
    public final vz9 b;
    public final vz9 c;
    public final vz9 d;
    public final mx3 e;
    public final j18 f;
    public final id7 g;
    public final vz9 h;
    public final ec3 i;

    public r91(YearMonth yearMonth, YearMonth yearMonth2, DayOfWeek dayOfWeek, YearMonth yearMonth3, ps9 ps9Var, ryf ryfVar) {
        int iIntValue;
        yearMonth.getClass();
        yearMonth2.getClass();
        dayOfWeek.getClass();
        yearMonth3.getClass();
        this.a = q1c.f(yearMonth);
        vz9 vz9VarF = q1c.f(yearMonth2);
        this.b = vz9VarF;
        vz9 vz9VarF2 = q1c.f(dayOfWeek);
        this.c = vz9VarF2;
        vz9 vz9VarF3 = q1c.f(ps9Var);
        this.d = vz9VarF3;
        this.e = zrd.b(new q91(this, 0));
        zrd.b(new q91(this, 1));
        if (ryfVar != null) {
            iIntValue = ryfVar.a();
        } else {
            Integer numF = f(yearMonth3);
            iIntValue = numF != null ? numF.intValue() : 0;
        }
        this.f = new j18(iIntValue, ryfVar != null ? ryfVar.b() : 0);
        this.g = new id7();
        vz9 vz9VarF4 = q1c.f(new f91(0, null, null));
        this.h = vz9VarF4;
        ec3 ec3Var = new ec3(new c1(26, this));
        this.i = ec3Var;
        ec3Var.clear();
        v2c.o(g(), (YearMonth) vz9VarF.getValue());
        YearMonth yearMonthG = g();
        YearMonth yearMonth4 = (YearMonth) vz9VarF.getValue();
        yearMonthG.getClass();
        yearMonth4.getClass();
        vz9VarF4.setValue(new f91(((int) ChronoUnit.MONTHS.between(yearMonthG, yearMonth4)) + 1, (DayOfWeek) vz9VarF2.getValue(), (ps9) vz9VarF3.getValue()));
    }

    @Override // defpackage.zhc
    public final boolean a() {
        return this.f.j.a();
    }

    @Override // defpackage.zhc
    public final Object b(s89 s89Var, l26 l26Var, zn2 zn2Var) {
        Object objB = this.f.b(s89Var, l26Var, zn2Var);
        return objB == bw2.a ? objB : wef.a;
    }

    @Override // defpackage.zhc
    public final boolean c() {
        return this.f.c();
    }

    @Override // defpackage.zhc
    public final boolean d() {
        return this.f.d();
    }

    @Override // defpackage.zhc
    public final float e(float f) {
        return this.f.j.e(f);
    }

    public final Integer f(YearMonth yearMonth) {
        YearMonth yearMonthG = g();
        if (yearMonth.compareTo((YearMonth) this.b.getValue()) <= 0 && yearMonth.compareTo(yearMonthG) >= 0) {
            YearMonth yearMonthG2 = g();
            yearMonthG2.getClass();
            return Integer.valueOf((int) ChronoUnit.MONTHS.between(yearMonthG2, yearMonth));
        }
        Log.d("CalendarState", "Attempting to scroll out of range: " + yearMonth);
        return null;
    }

    public final YearMonth g() {
        return (YearMonth) this.a.getValue();
    }
}
