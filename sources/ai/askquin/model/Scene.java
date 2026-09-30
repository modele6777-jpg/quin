package ai.askquin.model;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ag2;
import defpackage.an1;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.ib8;
import defpackage.ks0;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.syc;
import defpackage.tec;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.uec;
import defpackage.vec;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import defpackage.zib;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CDBM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rBq\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014Jf\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0014J\u0010\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J'\u0010.\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b,\u0010-R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u0014R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010/\u0012\u0004\b4\u00102\u001a\u0004\b3\u0010\u0014R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00105\u0012\u0004\b7\u00102\u001a\u0004\b6\u0010\u0017R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010/\u0012\u0004\b9\u00102\u001a\u0004\b8\u0010\u0014R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010/\u0012\u0004\b;\u00102\u001a\u0004\b:\u0010\u0014R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010/\u0012\u0004\b=\u00102\u001a\u0004\b<\u0010\u0014R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010/\u0012\u0004\b?\u00102\u001a\u0004\b>\u0010\u0014R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010/\u0012\u0004\bA\u00102\u001a\u0004\b@\u0010\u0014¨\u0006E"}, d2 = {"Lai/askquin/model/Scene;", "", "", "category", "darkImageURL", "", "guessQuestions", "id", "imageURL", "spreadKey", "subTitle", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxyc;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lai/askquin/model/Scene;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_model", "(Lai/askquin/model/Scene;Lag2;Lnyc;)V", "write$Self", "Ljava/lang/String;", "getCategory", "getCategory$annotations", "()V", "getDarkImageURL", "getDarkImageURL$annotations", "Ljava/util/List;", "getGuessQuestions", "getGuessQuestions$annotations", "getId", "getId$annotations", "getImageURL", "getImageURL$annotations", "getSpreadKey", "getSpreadKey$annotations", "getSubTitle", "getSubTitle$annotations", "getTitle", "getTitle$annotations", "Companion", "uec", "vec", "Quin.core:model"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class Scene {
    private final String category;
    private final String darkImageURL;
    private final List<String> guessQuestions;
    private final String id;
    private final String imageURL;
    private final String spreadKey;
    private final String subTitle;
    private final String title;
    public static final vec Companion = new vec();
    private static final lw7[] $childSerializers = {null, null, eb3.N(z18.b, new zib(27)), null, null, null, null, null};

    public Scene(String str, String str2, List<String> list, String str3, String str4, String str5, String str6, String str7) {
        str.getClass();
        str2.getClass();
        list.getClass();
        str3.getClass();
        str4.getClass();
        tec.x(str5, str6, str7);
        this.category = str;
        this.darkImageURL = str2;
        this.guessQuestions = list;
        this.id = str3;
        this.imageURL = str4;
        this.spreadKey = str5;
        this.subTitle = str6;
        this.title = str7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(p4e.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Scene copy$default(Scene scene, String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scene.category;
        }
        if ((i & 2) != 0) {
            str2 = scene.darkImageURL;
        }
        if ((i & 4) != 0) {
            list = scene.guessQuestions;
        }
        if ((i & 8) != 0) {
            str3 = scene.id;
        }
        if ((i & 16) != 0) {
            str4 = scene.imageURL;
        }
        if ((i & 32) != 0) {
            str5 = scene.spreadKey;
        }
        if ((i & 64) != 0) {
            str6 = scene.subTitle;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            str7 = scene.title;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        return scene.copy(str, str2, list, str3, str10, str11, str8, str9);
    }

    public static final /* synthetic */ void write$Self$Quin_core_model(Scene self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.w(serialDesc, 0, self.category);
        output.w(serialDesc, 1, self.darkImageURL);
        output.p(serialDesc, 2, (xn7) lw7VarArr[2].getValue(), self.guessQuestions);
        output.w(serialDesc, 3, self.id);
        output.w(serialDesc, 4, self.imageURL);
        output.w(serialDesc, 5, self.spreadKey);
        output.w(serialDesc, 6, self.subTitle);
        output.w(serialDesc, 7, self.title);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDarkImageURL() {
        return this.darkImageURL;
    }

    public final List<String> component3() {
        return this.guessQuestions;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getImageURL() {
        return this.imageURL;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSpreadKey() {
        return this.spreadKey;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final Scene copy(String category, String darkImageURL, List<String> guessQuestions, String id, String imageURL, String spreadKey, String subTitle, String title) {
        category.getClass();
        darkImageURL.getClass();
        guessQuestions.getClass();
        id.getClass();
        imageURL.getClass();
        spreadKey.getClass();
        subTitle.getClass();
        title.getClass();
        return new Scene(category, darkImageURL, guessQuestions, id, imageURL, spreadKey, subTitle, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Scene)) {
            return false;
        }
        Scene scene = (Scene) other;
        return pa7.t(this.category, scene.category) && pa7.t(this.darkImageURL, scene.darkImageURL) && pa7.t(this.guessQuestions, scene.guessQuestions) && pa7.t(this.id, scene.id) && pa7.t(this.imageURL, scene.imageURL) && pa7.t(this.spreadKey, scene.spreadKey) && pa7.t(this.subTitle, scene.subTitle) && pa7.t(this.title, scene.title);
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getDarkImageURL() {
        return this.darkImageURL;
    }

    public final List<String> getGuessQuestions() {
        return this.guessQuestions;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageURL() {
        return this.imageURL;
    }

    public final String getSpreadKey() {
        return this.spreadKey;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + ub3.c(ub3.c(ub3.c(ub3.c(tec.a(ub3.c(this.category.hashCode() * 31, 31, this.darkImageURL), 31, this.guessQuestions), 31, this.id), 31, this.imageURL), 31, this.spreadKey), 31, this.subTitle);
    }

    public String toString() {
        String str = this.category;
        String str2 = this.darkImageURL;
        List<String> list = this.guessQuestions;
        String str3 = this.id;
        String str4 = this.imageURL;
        String str5 = this.spreadKey;
        String str6 = this.subTitle;
        String str7 = this.title;
        StringBuilder sbO = ib8.o("Scene(category=", str, ", darkImageURL=", str2, ", guessQuestions=");
        sbO.append(list);
        sbO.append(", id=");
        sbO.append(str3);
        sbO.append(", imageURL=");
        ub3.v(sbO, str4, ", spreadKey=", str5, ", subTitle=");
        return ks0.m(sbO, str6, ", title=", str7, ")");
    }

    @syc("category")
    public static /* synthetic */ void getCategory$annotations() {
    }

    @syc("darkImageURL")
    public static /* synthetic */ void getDarkImageURL$annotations() {
    }

    @syc("guessQuestions")
    public static /* synthetic */ void getGuessQuestions$annotations() {
    }

    @syc("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @syc("imageURL")
    public static /* synthetic */ void getImageURL$annotations() {
    }

    @syc("spreadKey")
    public static /* synthetic */ void getSpreadKey$annotations() {
    }

    @syc("subTitle")
    public static /* synthetic */ void getSubTitle$annotations() {
    }

    @syc("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    public /* synthetic */ Scene(int i, String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, xyc xycVar) {
        if (255 != (i & 255)) {
            an1.R(i, 255, uec.a.e());
            throw null;
        }
        this.category = str;
        this.darkImageURL = str2;
        this.guessQuestions = list;
        this.id = str3;
        this.imageURL = str4;
        this.spreadKey = str5;
        this.subTitle = str6;
        this.title = str7;
    }
}
