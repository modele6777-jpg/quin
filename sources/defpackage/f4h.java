package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class f4h implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ e5h e;

    public /* synthetic */ f4h(e5h e5hVar, String str, String str2, String str3, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = e5hVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        String str = this.d;
        String str2 = this.c;
        String str3 = this.b;
        e5h e5hVar = this.e;
        switch (i) {
            case 0:
                ich ichVar = e5hVar.d;
                ichVar.U();
                krg krgVar = ichVar.c;
                ich.S(krgVar);
                return krgVar.y1(str3, str2, str);
            case 1:
                ich ichVar2 = e5hVar.d;
                ichVar2.U();
                krg krgVar2 = ichVar2.c;
                ich.S(krgVar2);
                return krgVar2.y1(str3, str2, str);
            case 2:
                ich ichVar3 = e5hVar.d;
                ichVar3.U();
                krg krgVar3 = ichVar3.c;
                ich.S(krgVar3);
                return krgVar3.C1(str3, str2, str);
            default:
                ich ichVar4 = e5hVar.d;
                ichVar4.U();
                krg krgVar4 = ichVar4.c;
                ich.S(krgVar4);
                return krgVar4.C1(str3, str2, str);
        }
    }
}
