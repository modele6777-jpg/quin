package ai.askquin.qa.bridge;

import defpackage.ag2;
import defpackage.an1;
import defpackage.bm1;
import defpackage.cm1;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.ib8;
import defpackage.jl0;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.tec;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.wy9;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0004\b\f\u0010\rBc\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003¢\u0006\u0004\b$\u0010 JX\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b3\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b6\u0010 ¨\u0006:"}, d2 = {"Lai/askquin/qa/bridge/CapabilityDescriptor;", "", "", "id", "title", "", "namespacePath", "leaf", "Lai/askquin/qa/bridge/Danger;", "danger", "Lai/askquin/qa/bridge/ParamSpec;", "params", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lai/askquin/qa/bridge/Danger;Ljava/util/List;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lai/askquin/qa/bridge/Danger;Ljava/util/List;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_qa_bridge", "(Lai/askquin/qa/bridge/CapabilityDescriptor;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "()Lai/askquin/qa/bridge/Danger;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lai/askquin/qa/bridge/Danger;Ljava/util/List;)Lai/askquin/qa/bridge/CapabilityDescriptor;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getTitle", "Ljava/util/List;", "getNamespacePath", "getLeaf", "Lai/askquin/qa/bridge/Danger;", "getDanger", "getParams", "Companion", "bm1", "cm1", "Quin:qa-bridge"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class CapabilityDescriptor {
    private static final lw7[] $childSerializers;
    public static final cm1 Companion = new cm1();
    private final Danger danger;
    private final String id;
    private final String leaf;
    private final List<String> namespacePath;
    private final List<ParamSpec> params;
    private final String title;

    static {
        jl0 jl0Var = new jl0(12);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{null, null, eb3.N(z18Var, jl0Var), null, eb3.N(z18Var, new jl0(13)), eb3.N(z18Var, new jl0(14))};
    }

    public CapabilityDescriptor(String str, String str2, List<String> list, String str3, Danger danger, List<ParamSpec> list2) {
        str.getClass();
        str2.getClass();
        list.getClass();
        str3.getClass();
        danger.getClass();
        list2.getClass();
        this.id = str;
        this.title = str2;
        this.namespacePath = list;
        this.leaf = str3;
        this.danger = danger;
        this.params = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(p4e.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$0() {
        return Danger.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$1() {
        return new dd0(wy9.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CapabilityDescriptor copy$default(CapabilityDescriptor capabilityDescriptor, String str, String str2, List list, String str3, Danger danger, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = capabilityDescriptor.id;
        }
        if ((i & 2) != 0) {
            str2 = capabilityDescriptor.title;
        }
        if ((i & 4) != 0) {
            list = capabilityDescriptor.namespacePath;
        }
        if ((i & 8) != 0) {
            str3 = capabilityDescriptor.leaf;
        }
        if ((i & 16) != 0) {
            danger = capabilityDescriptor.danger;
        }
        if ((i & 32) != 0) {
            list2 = capabilityDescriptor.params;
        }
        Danger danger2 = danger;
        List list3 = list2;
        return capabilityDescriptor.copy(str, str2, list, str3, danger2, list3);
    }

    public static final /* synthetic */ void write$Self$Quin_qa_bridge(CapabilityDescriptor self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.w(serialDesc, 0, self.id);
        output.w(serialDesc, 1, self.title);
        output.p(serialDesc, 2, (xn7) lw7VarArr[2].getValue(), self.namespacePath);
        output.w(serialDesc, 3, self.leaf);
        output.p(serialDesc, 4, (xn7) lw7VarArr[4].getValue(), self.danger);
        output.p(serialDesc, 5, (xn7) lw7VarArr[5].getValue(), self.params);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<String> component3() {
        return this.namespacePath;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLeaf() {
        return this.leaf;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Danger getDanger() {
        return this.danger;
    }

    public final List<ParamSpec> component6() {
        return this.params;
    }

    public final CapabilityDescriptor copy(String id, String title, List<String> namespacePath, String leaf, Danger danger, List<ParamSpec> params) {
        id.getClass();
        title.getClass();
        namespacePath.getClass();
        leaf.getClass();
        danger.getClass();
        params.getClass();
        return new CapabilityDescriptor(id, title, namespacePath, leaf, danger, params);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CapabilityDescriptor)) {
            return false;
        }
        CapabilityDescriptor capabilityDescriptor = (CapabilityDescriptor) other;
        return pa7.t(this.id, capabilityDescriptor.id) && pa7.t(this.title, capabilityDescriptor.title) && pa7.t(this.namespacePath, capabilityDescriptor.namespacePath) && pa7.t(this.leaf, capabilityDescriptor.leaf) && this.danger == capabilityDescriptor.danger && pa7.t(this.params, capabilityDescriptor.params);
    }

    public final Danger getDanger() {
        return this.danger;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLeaf() {
        return this.leaf;
    }

    public final List<String> getNamespacePath() {
        return this.namespacePath;
    }

    public final List<ParamSpec> getParams() {
        return this.params;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.params.hashCode() + ((this.danger.hashCode() + ub3.c(tec.a(ub3.c(this.id.hashCode() * 31, 31, this.title), 31, this.namespacePath), 31, this.leaf)) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        List<String> list = this.namespacePath;
        String str3 = this.leaf;
        Danger danger = this.danger;
        List<ParamSpec> list2 = this.params;
        StringBuilder sbO = ib8.o("CapabilityDescriptor(id=", str, ", title=", str2, ", namespacePath=");
        sbO.append(list);
        sbO.append(", leaf=");
        sbO.append(str3);
        sbO.append(", danger=");
        sbO.append(danger);
        sbO.append(", params=");
        sbO.append(list2);
        sbO.append(")");
        return sbO.toString();
    }

    public /* synthetic */ CapabilityDescriptor(int i, String str, String str2, List list, String str3, Danger danger, List list2, xyc xycVar) {
        if (63 != (i & 63)) {
            an1.R(i, 63, bm1.a.e());
            throw null;
        }
        this.id = str;
        this.title = str2;
        this.namespacePath = list;
        this.leaf = str3;
        this.danger = danger;
        this.params = list2;
    }
}
