package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zj6 implements PointerInputEventHandler {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ a26 c;
    public final /* synthetic */ Object d;

    public zj6(float f, cn6 cn6Var, a26 a26Var) {
        this.b = f;
        this.d = cn6Var;
        this.c = a26Var;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [yj6] */
    /* JADX WARN: Type inference failed for: r4v1, types: [yj6] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(tia tiaVar, xn2 xn2Var) {
        int i = this.a;
        final a26 a26Var = this.c;
        Object obj = this.d;
        final float f = this.b;
        switch (i) {
            case 0:
                final jmb jmbVar = new jmb();
                final int i2 = 0;
                return rk4.j(tiaVar, new a26() { // from class: yj6
                    @Override // defpackage.a26
                    public final Object d(Object obj2) {
                        int i3 = i2;
                        wef wefVar = wef.a;
                        jmb jmbVar2 = jmbVar;
                        switch (i3) {
                            case 0:
                                jmbVar2.element = 0.0f;
                                break;
                            default:
                                jmbVar2.element = 0.0f;
                                break;
                        }
                        return wefVar;
                    }
                }, null, null, new vr1(jmbVar, (t91) obj, f, a26Var), xn2Var, 6);
            default:
                final jmb jmbVar2 = new jmb();
                final int i3 = 1;
                final cn6 cn6Var = (cn6) obj;
                return rk4.i(tiaVar, new a26() { // from class: yj6
                    @Override // defpackage.a26
                    public final Object d(Object obj2) {
                        int i4 = i3;
                        wef wefVar = wef.a;
                        jmb jmbVar3 = jmbVar2;
                        switch (i4) {
                            case 0:
                                jmbVar3.element = 0.0f;
                                break;
                            default:
                                jmbVar3.element = 0.0f;
                                break;
                        }
                        return wefVar;
                    }
                }, new x16() { // from class: lk6
                    @Override // defpackage.x16
                    public final Object invoke() {
                        cn6 cn6Var2 = cn6Var;
                        LocalDate localDate = cn6Var2.d;
                        float f2 = jmbVar2.element;
                        float f3 = f;
                        float f4 = -f3;
                        a26 a26Var2 = a26Var;
                        if (f2 <= f4) {
                            LocalDate localDatePlusDays = localDate.plusDays(1L);
                            if (!localDatePlusDays.isAfter(cn6Var2.b)) {
                                a26Var2.d(localDatePlusDays);
                            }
                        } else if (f2 >= f3) {
                            LocalDate localDateMinusDays = localDate.minusDays(1L);
                            if (!localDateMinusDays.isBefore(cn6Var2.a)) {
                                a26Var2.d(localDateMinusDays);
                            }
                        }
                        return wef.a;
                    }
                }, null, new kk4(jmbVar2, 2), xn2Var, 4);
        }
    }

    public zj6(t91 t91Var, float f, a26 a26Var) {
        this.d = t91Var;
        this.b = f;
        this.c = a26Var;
    }
}
