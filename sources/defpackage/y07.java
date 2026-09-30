package defpackage;

import java.time.DateTimeException;
import java.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class y07 implements cdg, vd3, gu2 {
    public final d17 a;
    public Integer b;
    public Integer c;
    public Integer d;

    public y07(d17 d17Var, Integer num, Integer num2, Integer num3) {
        this.a = d17Var;
        this.b = num;
        this.c = num2;
        this.d = num3;
    }

    @Override // defpackage.vd3
    public final void F(Integer num) {
        this.d = num;
    }

    @Override // defpackage.gu2
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y07 copy() {
        d17 d17Var = this.a;
        return new y07(new d17(d17Var.a, d17Var.b), this.b, this.c, this.d);
    }

    public final ma8 b() throws Exception {
        ma8 ma8Var;
        d17 d17Var = this.a;
        Integer num = d17Var.a;
        idg.a(num, "year");
        int iIntValue = num.intValue();
        Integer num2 = this.d;
        if (num2 == null) {
            Integer num3 = d17Var.b;
            idg.a(num3, "monthNumber");
            int iIntValue2 = num3.intValue();
            Integer num4 = this.b;
            idg.a(num4, "day");
            ma8Var = new ma8(iIntValue, iIntValue2, num4.intValue());
        } else {
            ma8 ma8Var2 = new ma8(iIntValue, 1, 1);
            int iIntValue3 = num2.intValue() - 1;
            ug3.Companion.getClass();
            pg3 pg3Var = ug3.a;
            pg3Var.getClass();
            long j = iIntValue3;
            int i = qa8.c;
            try {
                long jAddExact = Math.addExact(ma8Var2.i().toEpochDay(), Math.multiplyExact(j, pg3Var.b));
                long j2 = qa8.a;
                if (jAddExact > qa8.b || j2 > jAddExact) {
                    throw new DateTimeException("The resulting day " + jAddExact + " is out of supported LocalDate range.");
                }
                LocalDate localDateOfEpochDay = LocalDate.ofEpochDay(jAddExact);
                localDateOfEpochDay.getClass();
                ma8 ma8Var3 = new ma8(localDateOfEpochDay);
                if (ma8Var3.j() != iIntValue) {
                    throw new kg3("Can not create a LocalDate from the given input: the day of year is " + num2 + ", which is not a valid day of year for the year " + iIntValue);
                }
                if (d17Var.b != null) {
                    int iX = ok8.x(ma8Var3.g());
                    Integer num5 = d17Var.b;
                    if (num5 == null || iX != num5.intValue()) {
                        StringBuilder sb = new StringBuilder("Can not create a LocalDate from the given input: the day of year is ");
                        sb.append(num2);
                        sb.append(", which is ");
                        sb.append(ma8Var3.g());
                        Integer num6 = d17Var.b;
                        sb.append(", but ");
                        sb.append(num6);
                        sb.append(" was specified as the month number");
                        throw new kg3(sb.toString());
                    }
                }
                if (this.b != null) {
                    int iB = ma8Var3.b();
                    Integer num7 = this.b;
                    if (num7 == null || iB != num7.intValue()) {
                        StringBuilder sb2 = new StringBuilder("Can not create a LocalDate from the given input: the day of year is ");
                        sb2.append(num2);
                        sb2.append(", which is the day ");
                        sb2.append(ma8Var3.b());
                        sb2.append(" of ");
                        sb2.append(ma8Var3.g());
                        Integer num8 = this.b;
                        sb2.append(", but ");
                        sb2.append(num8);
                        sb2.append(" was specified as the day of month");
                        throw new kg3(sb2.toString());
                    }
                }
                ma8Var = ma8Var3;
            } catch (Exception e) {
                if (!(e instanceof DateTimeException) && !(e instanceof ArithmeticException)) {
                    throw e;
                }
                throw new yf3("The result of adding " + j + " of " + pg3Var + " to " + ma8Var2 + " is out of LocalDate range.", e);
            }
        }
        Integer num9 = this.c;
        if (num9 != null) {
            int iIntValue4 = num9.intValue();
            gh3 gh3VarD = ma8Var.d();
            gh3VarD.getClass();
            if (iIntValue4 != gh3VarD.ordinal() + 1) {
                StringBuilder sb3 = new StringBuilder("Can not create a LocalDate from the given input: the day of week is ");
                if (1 > iIntValue4 || iIntValue4 >= 8) {
                    qc0.o(tec.e(iIntValue4, "Expected ISO day-of-week number in 1..7, got "));
                    return null;
                }
                sb3.append((gh3) gh3.b.get(iIntValue4 - 1));
                sb3.append(" but the date is ");
                sb3.append(ma8Var);
                sb3.append(", which is a ");
                sb3.append(ma8Var.d());
                throw new kg3(sb3.toString());
            }
        }
        return ma8Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y07)) {
            return false;
        }
        y07 y07Var = (y07) obj;
        return pa7.t(this.a, y07Var.a) && pa7.t(this.b, y07Var.b) && pa7.t(this.c, y07Var.c) && pa7.t(this.d, y07Var.d);
    }

    @Override // defpackage.cdg
    public final void g(Integer num) {
        this.a.b = num;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 29791;
        Integer num = this.b;
        int iHashCode2 = ((num != null ? num.hashCode() : 0) * 961) + iHashCode;
        Integer num2 = this.c;
        int iHashCode3 = ((num2 != null ? num2.hashCode() : 0) * 31) + iHashCode2;
        Integer num3 = this.d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // defpackage.cdg
    public final Integer l() {
        return this.a.a;
    }

    @Override // defpackage.vd3
    public final Integer m() {
        return this.c;
    }

    @Override // defpackage.vd3
    public final Integer r() {
        return this.b;
    }

    @Override // defpackage.vd3
    public final void s(Integer num) {
        this.b = num;
    }

    public final String toString() {
        Integer num = this.d;
        d17 d17Var = this.a;
        if (num == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(d17Var);
            sb.append('-');
            Object obj = this.b;
            if (obj == null) {
                obj = "??";
            }
            sb.append(obj);
            sb.append(" (day of week is ");
            Integer num2 = this.c;
            sb.append(num2 != null ? num2 : "??");
            sb.append(')');
            return sb.toString();
        }
        if (this.b == null && d17Var.b == null) {
            StringBuilder sb2 = new StringBuilder("(");
            Object obj2 = d17Var.a;
            if (obj2 == null) {
                obj2 = "??";
            }
            sb2.append(obj2);
            sb2.append(")-");
            sb2.append(this.d);
            sb2.append(" (day of week is ");
            Integer num3 = this.c;
            sb2.append(num3 != null ? num3 : "??");
            sb2.append(')');
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(d17Var);
        sb3.append('-');
        Object obj3 = this.b;
        if (obj3 == null) {
            obj3 = "??";
        }
        sb3.append(obj3);
        sb3.append(" (day of week is ");
        Integer num4 = this.c;
        sb3.append(num4 != null ? num4 : "??");
        sb3.append(", day of year is ");
        sb3.append(this.d);
        sb3.append(')');
        return sb3.toString();
    }

    @Override // defpackage.vd3
    public final Integer u() {
        return this.d;
    }

    @Override // defpackage.cdg
    public final void v(Integer num) {
        this.a.a = num;
    }

    @Override // defpackage.cdg
    public final Integer y() {
        return this.a.b;
    }

    @Override // defpackage.vd3
    public final void z(Integer num) {
        this.c = num;
    }

    public /* synthetic */ y07() {
        this(new d17(null, null), null, null, null);
    }
}
