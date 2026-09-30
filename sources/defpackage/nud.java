package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public enum nud {
    a("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
    b(null, true),
    c("Ljava/lang/Object;", true);

    private final boolean isObjectReplacedWithTypeParameter;
    private final String valueParametersSignature;

    nud(String str, boolean z) {
        this.valueParametersSignature = str;
        this.isObjectReplacedWithTypeParameter = z;
    }
}
