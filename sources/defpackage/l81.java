package defpackage;

import android.util.CloseGuard;
import com.google.firebase.abt.component.AbtRegistrar;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l81 implements bc2, o95 {
    public static final l81 b = new l81(0);
    public static final l81 c = new l81(1);
    public static final l81 d = new l81(2);
    public final /* synthetic */ int a;

    public /* synthetic */ l81(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ CloseGuard b(Object obj) {
        return (CloseGuard) obj;
    }

    public static /* synthetic */ void g(Object obj, Object obj2) {
        throw new r8e("Fragment " + obj + obj2);
    }

    public static /* synthetic */ void h(Object obj, Object obj2, String str) {
        throw new ih7(str + obj + ((Object) " at path ") + obj2);
    }

    @Override // defpackage.bc2
    public Object c(hbc hbcVar) {
        return AbtRegistrar.lambda$getComponents$0(hbcVar);
    }

    @Override // defpackage.o95
    public l95[] d() {
        switch (this.a) {
            case 6:
                return new l95[]{new a6()};
            case 7:
                return new l95[]{new c6()};
            default:
                return new l95[]{new rh()};
        }
    }

    public void A() {
    }
}
