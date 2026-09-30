package defpackage;

import java.io.File;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lx2 implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return ((File) obj).exists();
    }
}
