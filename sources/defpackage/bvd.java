package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import io.sentry.android.core.b1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bvd implements Iterable {
    public final /* synthetic */ int a;
    public final Serializable b;
    public final Object c;

    public bvd(Context context) {
        this.a = 1;
        this.b = new ArrayList();
        this.c = context;
    }

    public void a(ComponentName componentName) {
        Context context = (Context) this.c;
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        try {
            for (Intent intentM = kn2.M(context, componentName); intentM != null; intentM = kn2.M(context, intentM.getComponent())) {
                arrayList.add(size, intentM);
            }
        } catch (PackageManager.NameNotFoundException e) {
            b1.d("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty()) {
            qc0.p("No intents added to TaskStackBuilder; cannot startActivities");
            return;
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        ((Context) this.c).startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.a;
        Serializable serializable = this.b;
        switch (i) {
            case 0:
                j27 j27Var = (j27) this.c;
                return ((cvd) j27Var.d).b(j27Var, (String) serializable);
            default:
                return ((ArrayList) serializable).iterator();
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                ue1 ue1Var = new ue1(", ", 1);
                StringBuilder sb = new StringBuilder();
                sb.append('[');
                ue1Var.a(sb, iterator());
                sb.append(']');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public bvd(j27 j27Var, String str) {
        this.a = 0;
        this.b = str;
        this.c = j27Var;
    }
}
