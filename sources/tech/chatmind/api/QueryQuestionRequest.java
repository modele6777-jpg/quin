package tech.chatmind.api;

import defpackage.ag2;
import defpackage.an1;
import defpackage.bca;
import defpackage.eb3;
import defpackage.f4b;
import defpackage.g4b;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.tyc;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Ltech/chatmind/api/QueryQuestionRequest;", "", "Ltech/chatmind/api/TemplateCategory;", "category", "", "locale", "<init>", "(Ltech/chatmind/api/TemplateCategory;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILtech/chatmind/api/TemplateCategory;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/QueryQuestionRequest;Lag2;Lnyc;)V", "write$Self", "component1", "()Ltech/chatmind/api/TemplateCategory;", "component2", "()Ljava/lang/String;", "copy", "(Ltech/chatmind/api/TemplateCategory;Ljava/lang/String;)Ltech/chatmind/api/QueryQuestionRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ltech/chatmind/api/TemplateCategory;", "getCategory", "Ljava/lang/String;", "getLocale", "Companion", "f4b", "g4b", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class QueryQuestionRequest {
    public static final int $stable = 0;
    private final TemplateCategory category;
    private final String locale;
    public static final g4b Companion = new g4b();
    private static final lw7[] $childSerializers = {eb3.N(z18.b, new bca(21)), null};

    public /* synthetic */ QueryQuestionRequest(int i, TemplateCategory templateCategory, String str, xyc xycVar) {
        if (3 != (i & 3)) {
            an1.R(i, 3, f4b.a.e());
            throw null;
        }
        this.category = templateCategory;
        this.locale = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return TemplateCategory.Companion.serializer();
    }

    public static /* synthetic */ QueryQuestionRequest copy$default(QueryQuestionRequest queryQuestionRequest, TemplateCategory templateCategory, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            templateCategory = queryQuestionRequest.category;
        }
        if ((i & 2) != 0) {
            str = queryQuestionRequest.locale;
        }
        return queryQuestionRequest.copy(templateCategory, str);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(QueryQuestionRequest self, ag2 output, nyc serialDesc) {
        output.p(serialDesc, 0, (xn7) $childSerializers[0].getValue(), self.category);
        output.w(serialDesc, 1, self.locale);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TemplateCategory getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    public final QueryQuestionRequest copy(TemplateCategory category, String locale) {
        category.getClass();
        locale.getClass();
        return new QueryQuestionRequest(category, locale);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryQuestionRequest)) {
            return false;
        }
        QueryQuestionRequest queryQuestionRequest = (QueryQuestionRequest) other;
        return this.category == queryQuestionRequest.category && pa7.t(this.locale, queryQuestionRequest.locale);
    }

    public final TemplateCategory getCategory() {
        return this.category;
    }

    public final String getLocale() {
        return this.locale;
    }

    public int hashCode() {
        return this.locale.hashCode() + (this.category.hashCode() * 31);
    }

    public String toString() {
        return "QueryQuestionRequest(category=" + this.category + ", locale=" + this.locale + ")";
    }

    public QueryQuestionRequest(TemplateCategory templateCategory, String str) {
        templateCategory.getClass();
        str.getClass();
        this.category = templateCategory;
        this.locale = str;
    }
}
