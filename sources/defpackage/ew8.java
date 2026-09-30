package defpackage;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lew8;", "Lyyc;", "", "", "missingFields", "Ljava/util/List;", "getMissingFields", "()Ljava/util/List;", "serialName", "Ljava/lang/String;", "getSerialName", "()Ljava/lang/String;", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = z7c.f)
public final class ew8 extends yyc {
    private final List<String> missingFields;
    private final String serialName;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ew8(String str, String str2) {
        this(tec.m("Field '", str, "' is required for type with serial name '", str2, "', but it was missing"), null, t72.H(str), str2);
        str2.getClass();
    }

    public final ew8 b(String str) {
        return new ew8(str, this, this.missingFields, this.serialName);
    }

    public ew8(String str, ew8 ew8Var, List list, String str2) {
        super(str, ew8Var);
        this.missingFields = list;
        this.serialName = str2;
    }
}
