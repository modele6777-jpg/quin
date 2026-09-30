package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public interface p1 extends jg3 {
    @Override // defpackage.jg3
    default void a(String str) {
        str.getClass();
        e().a(new zk2(str));
    }

    default v81 build() {
        return new v81(e().a);
    }

    mx e();

    p1 l();
}
