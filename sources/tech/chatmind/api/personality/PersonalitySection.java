package tech.chatmind.api.personality;

import defpackage.ag2;
import defpackage.an1;
import defpackage.bca;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.eca;
import defpackage.fca;
import defpackage.h2f;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.tyc;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u001a¨\u0006+"}, d2 = {"Ltech/chatmind/api/personality/PersonalitySection;", "", "", "title", "", "Ltech/chatmind/api/personality/TraitItem;", "list", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/personality/PersonalitySection;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Ltech/chatmind/api/personality/PersonalitySection;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getList", "Companion", "eca", "fca", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class PersonalitySection {
    public static final int $stable = 8;
    private final List<TraitItem> list;
    private final String title;
    public static final fca Companion = new fca();
    private static final lw7[] $childSerializers = {null, eb3.N(z18.b, new bca(2))};

    public /* synthetic */ PersonalitySection(int i, String str, List list, xyc xycVar) {
        if (3 != (i & 3)) {
            an1.R(i, 3, eca.a.e());
            throw null;
        }
        this.title = str;
        this.list = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(h2f.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PersonalitySection copy$default(PersonalitySection personalitySection, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = personalitySection.title;
        }
        if ((i & 2) != 0) {
            list = personalitySection.list;
        }
        return personalitySection.copy(str, list);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(PersonalitySection self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.w(serialDesc, 0, self.title);
        output.p(serialDesc, 1, (xn7) lw7VarArr[1].getValue(), self.list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<TraitItem> component2() {
        return this.list;
    }

    public final PersonalitySection copy(String title, List<TraitItem> list) {
        title.getClass();
        list.getClass();
        return new PersonalitySection(title, list);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalitySection)) {
            return false;
        }
        PersonalitySection personalitySection = (PersonalitySection) other;
        return pa7.t(this.title, personalitySection.title) && pa7.t(this.list, personalitySection.list);
    }

    public final List<TraitItem> getList() {
        return this.list;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.list.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return "PersonalitySection(title=" + this.title + ", list=" + this.list + ")";
    }

    public PersonalitySection(String str, List<TraitItem> list) {
        str.getClass();
        list.getClass();
        this.title = str;
        this.list = list;
    }
}
