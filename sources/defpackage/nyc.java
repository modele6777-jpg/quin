package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public interface nyc {
    String a();

    default boolean c() {
        return false;
    }

    int d(String str);

    int e();

    String f(int i);

    iec g();

    default List getAnnotations() {
        return pu4.a;
    }

    List h(int i);

    nyc i(int i);

    default boolean isInline() {
        return false;
    }

    boolean j(int i);
}
