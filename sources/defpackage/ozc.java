package defpackage;

import android.content.Context;
import android.view.View;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ozc implements qa4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ozc(int i, Object obj, Object obj2) {
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
                ((Context) obj2).unbindService((pzc) obj);
                break;
            case 1:
                ((mib) ((aw6) obj2)).e();
                ((mib) ((aw6) obj)).e();
                break;
            case 2:
                ((x48) obj2).k().b((y6) obj);
                break;
            case 3:
                ((x48) obj2).k().b((y6) obj);
                break;
            case 4:
                e89 e89Var = (e89) obj2;
                pta ptaVar = (pta) e89Var.getValue();
                if (ptaVar != null) {
                    ota otaVar = new ota(ptaVar);
                    t69 t69Var = (t69) obj;
                    if (t69Var != null) {
                        ((u69) t69Var).b(otaVar);
                    }
                    e89Var.setValue(null);
                }
                break;
            case 5:
                ((yte) obj2).c.remove((a26) obj);
                break;
            case 6:
                ((cb9) obj2).i((k7b) obj);
                break;
            case 7:
                ((n3f) obj2).k.remove((p3f) obj);
                break;
            case 8:
                n3f n3fVar = (n3f) obj2;
                n3fVar.getClass();
                f3f f3fVar = (f3f) ((g3f) obj).b.getValue();
                if (f3fVar != null) {
                    n3fVar.j.remove(f3fVar.a);
                }
                break;
            case 9:
                ((n3f) obj2).j.remove((k3f) obj);
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((x48) obj2).k().b((y6) obj);
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((pad) obj2).c();
                ((pad) obj).c();
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                y45 y45Var = (y45) ((ExoPlayer) obj2);
                y45Var.F((auf) obj);
                y45Var.E();
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((x48) obj2).k().b((zo2) obj);
                break;
            default:
                m8g m8gVar = (m8g) obj2;
                View view = (View) obj;
                int i2 = m8gVar.u - 1;
                m8gVar.u = i2;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = nvf.a;
                    fvf.c(view, null);
                    n7g.a(view, null);
                    view.removeOnAttachStateChangeListener(m8gVar.v);
                }
                break;
        }
    }
}
