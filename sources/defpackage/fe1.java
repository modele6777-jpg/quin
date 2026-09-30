package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fe1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fe1(he1 he1Var, ge1 ge1Var, qtb qtbVar, int i) {
        this.a = 0;
        this.c = he1Var;
        this.d = qtbVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.d;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((he1) obj2).d(ge1.c((qtb) obj), i2);
                break;
            case 1:
                tb2 tb2Var = (tb2) obj2;
                Object obj3 = ((ze) obj).a;
                String str = (String) tb2Var.a.get(Integer.valueOf(i2));
                if (str != null) {
                    gf gfVar = (gf) tb2Var.e.get(str);
                    if ((gfVar != null ? gfVar.a : null) == null) {
                        tb2Var.g.remove(str);
                        tb2Var.f.put(str, obj3);
                    } else {
                        ye yeVar = gfVar.a;
                        if (tb2Var.d.remove(str)) {
                            yeVar.j(obj3);
                        }
                    }
                    break;
                }
                break;
            case 2:
                ((tb2) obj2).a(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            case 3:
                ((lwa) ((o74) obj2).c).n(i2, obj);
                break;
            default:
                c98 c98Var = (c98) obj;
                for (e98 e98Var : (CopyOnWriteArraySet) obj2) {
                    if (!e98Var.d) {
                        if (i2 != -1) {
                            e98Var.b.a(i2);
                        }
                        e98Var.c = true;
                        c98Var.d(e98Var.a);
                    }
                }
                break;
        }
    }

    public /* synthetic */ fe1(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }
}
