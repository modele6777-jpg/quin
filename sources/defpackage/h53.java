package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h53 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ h53(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                return Integer.valueOf(list.size());
            case 1:
                return Integer.valueOf(list.size() * 1000);
            case 2:
                return Integer.valueOf(list.size());
            case 3:
                Object obj = list.get(2);
                obj.getClass();
                return (Integer) obj;
            case 4:
                return db6.A0(pu4.a, list);
            case 5:
                return list;
            case 6:
                return Integer.valueOf(list.size());
            case 7:
                return ((yn7) list.get(0)).B();
            case 8:
                return ((yn7) list.get(0)).B();
            case 9:
                return Integer.valueOf(list.size());
            default:
                return Integer.valueOf(list.size());
        }
    }
}
