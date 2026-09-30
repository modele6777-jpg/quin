package defpackage;

import android.content.Context;
import android.os.Process;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class iva {
    public final Context a;
    public final ace b;
    public final int c;
    public final ace d;
    public final ace e;
    public boolean f;

    public iva(Context context, grf grfVar) {
        context.getClass();
        grfVar.getClass();
        this.a = context;
        final int i = 0;
        this.b = new ace(new x16(this) { // from class: hva
            public final /* synthetic */ iva b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i2 = i;
                iva ivaVar = this.b;
                switch (i2) {
                    case 0:
                        return ((jva) ivaVar.e.getValue()).a;
                    default:
                        return q6.n(ivaVar.a);
                }
            }
        });
        this.c = Process.myPid();
        this.d = new ace(new hla(2, grfVar));
        final int i2 = 1;
        this.e = new ace(new x16(this) { // from class: hva
            public final /* synthetic */ iva b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i3 = i2;
                iva ivaVar = this.b;
                switch (i3) {
                    case 0:
                        return ((jva) ivaVar.e.getValue()).a;
                    default:
                        return q6.n(ivaVar.a);
                }
            }
        });
    }

    public final String a() {
        return (String) this.b.getValue();
    }

    public final Map b(Map map) {
        ace aceVar = this.d;
        if (map == null) {
            return bm8.G(new iy9(a(), new gva(Process.myPid(), (String) aceVar.getValue())));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(a(), new gva(Process.myPid(), (String) aceVar.getValue()));
        return bm8.X(linkedHashMap);
    }
}
