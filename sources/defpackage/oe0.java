package defpackage;

import android.content.Context;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oe0 implements qa4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oe0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.qa4
    public final void a() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                je0 je0Var = (je0) obj2;
                String str = (String) obj;
                if (pa7.t((String) je0Var.g.getValue(), str) && ((Boolean) je0Var.w.getValue()).booleanValue()) {
                    je0Var.f(str);
                    break;
                }
                break;
            case 1:
                ((x48) obj2).k().b((xm0) obj);
                break;
            case 2:
                ((zr0) obj2).b((je2) obj);
                break;
            case 3:
                ((x48) obj2).k().b((ap2) obj);
                break;
            case 4:
                ((vb2) obj2).z.remove((xo2) obj);
                break;
            case 5:
                ((da9) obj2).v.j.b((zo2) obj);
                break;
            case 6:
                ((x48) obj2).k().b((yo2) obj);
                break;
            case 7:
                ((vb2) obj2).z.remove((wo2) obj);
                break;
            case 8:
                ((vb2) obj2).z.remove((wo2) obj);
                break;
            case 9:
                ((vb2) obj2).z.remove((vo2) obj);
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                y63 y63Var = (y63) obj2;
                y63Var.g();
                Context applicationContext = ((Context) obj).getApplicationContext();
                applicationContext.getClass();
                y63.p(y63Var, applicationContext);
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((x48) obj2).k().b((ap2) obj);
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((da9) obj2).v.j.b((m84) obj);
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((x48) obj2).k().b((y6) obj);
                break;
            case 14:
                ((x48) obj2).k().b((y6) obj);
                break;
            case 15:
                ((x48) obj2).k().b((ff) obj);
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((x48) obj2).k().b((in6) obj);
                break;
            case 17:
                ((p27) obj2).a.j((m27) obj);
                break;
            case 18:
                ((o18) obj2).c.l(obj);
                break;
            case 19:
                ((x48) obj2).k().b((xm0) obj);
                break;
            case 20:
                z7f.m((s69) obj2, (e89) obj, false);
                break;
            case 21:
                hu8 hu8Var = (hu8) obj2;
                hu8Var.c.setValue(Boolean.FALSE);
                fwc fwcVar = hu8Var.a.b;
                if (fwcVar != null) {
                    fwcVar.m();
                }
                hu8Var.b = null;
                iu8 iu8Var = (iu8) obj;
                if (iu8Var != null) {
                    iu8Var.a.remove(hu8Var);
                }
                break;
            case 22:
                Iterator it = ((List) ((h0e) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((se2) obj).b().c((da9) it.next());
                }
                break;
            case 23:
                ((x48) obj2).k().b((xm0) obj);
                break;
            case 24:
                ((zr0) obj2).b((af2) obj);
                break;
            case 25:
                ((cb9) obj2).i((k7b) obj);
                break;
            case 26:
                ((ufb) obj2).a();
                fwc fwcVar2 = ((qwc) obj).b;
                if (fwcVar2 != null) {
                    fwcVar2.m();
                }
                break;
            case 27:
                phb phbVar = (phb) obj2;
                if (phbVar != null) {
                    lhb lhbVar = (lhb) obj;
                    lhbVar.getClass();
                    phbVar.a.remove(lhbVar);
                }
                break;
            case 28:
                ((q7b) obj2).a.i((csc) obj);
                break;
            default:
                qwc qwcVar = (qwc) obj2;
                if (qwcVar.b == ((fwc) obj)) {
                    qwcVar.b = null;
                    qwcVar.a.setValue(null);
                }
                break;
        }
    }
}
