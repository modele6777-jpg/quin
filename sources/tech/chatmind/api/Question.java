package tech.chatmind.api;

import defpackage.ag2;
import defpackage.an1;
import defpackage.bca;
import defpackage.eb3;
import defpackage.l4b;
import defpackage.lw7;
import defpackage.m4b;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Ltech/chatmind/api/Question;", "", "Ltech/chatmind/api/TemplateCategory;", "category", "", "question", "<init>", "(Ltech/chatmind/api/TemplateCategory;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILtech/chatmind/api/TemplateCategory;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/Question;Lag2;Lnyc;)V", "write$Self", "component1", "()Ltech/chatmind/api/TemplateCategory;", "component2", "()Ljava/lang/String;", "copy", "(Ltech/chatmind/api/TemplateCategory;Ljava/lang/String;)Ltech/chatmind/api/Question;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ltech/chatmind/api/TemplateCategory;", "getCategory", "Ljava/lang/String;", "getQuestion", "Companion", "l4b", "m4b", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class Question {
    public static final int $stable = 0;
    private final TemplateCategory category;
    private final String question;
    public static final m4b Companion = new m4b();
    private static final lw7[] $childSerializers = {eb3.N(z18.b, new bca(23)), null};

    public /* synthetic */ Question(int i, TemplateCategory templateCategory, String str, xyc xycVar) {
        if (2 != (i & 2)) {
            an1.R(i, 2, l4b.a.e());
            throw null;
        }
        if ((i & 1) == 0) {
            this.category = TemplateCategory.UNKNOWN;
        } else {
            this.category = templateCategory;
        }
        this.question = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return TemplateCategory.Companion.serializer();
    }

    public static /* synthetic */ Question copy$default(Question question, TemplateCategory templateCategory, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            templateCategory = question.category;
        }
        if ((i & 2) != 0) {
            str = question.question;
        }
        return question.copy(templateCategory, str);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(Question self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        if (output.g(serialDesc) || self.category != TemplateCategory.UNKNOWN) {
            output.p(serialDesc, 0, (xn7) lw7VarArr[0].getValue(), self.category);
        }
        output.w(serialDesc, 1, self.question);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TemplateCategory getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getQuestion() {
        return this.question;
    }

    public final Question copy(TemplateCategory category, String question) {
        category.getClass();
        question.getClass();
        return new Question(category, question);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Question)) {
            return false;
        }
        Question question = (Question) other;
        return this.category == question.category && pa7.t(this.question, question.question);
    }

    public final TemplateCategory getCategory() {
        return this.category;
    }

    public final String getQuestion() {
        return this.question;
    }

    public int hashCode() {
        return this.question.hashCode() + (this.category.hashCode() * 31);
    }

    public String toString() {
        return "Question(category=" + this.category + ", question=" + this.question + ")";
    }

    public Question(TemplateCategory templateCategory, String str) {
        templateCategory.getClass();
        str.getClass();
        this.category = templateCategory;
        this.question = str;
    }

    public /* synthetic */ Question(TemplateCategory templateCategory, String str, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? TemplateCategory.UNKNOWN : templateCategory, str);
    }
}
