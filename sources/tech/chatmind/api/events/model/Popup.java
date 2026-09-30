package tech.chatmind.api.events.model;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ag2;
import defpackage.an1;
import defpackage.au6;
import defpackage.bca;
import defpackage.c77;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.ls0;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.qma;
import defpackage.rp3;
import defpackage.sja;
import defpackage.tja;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.uja;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0002IJBg\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u007f\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0013\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010 J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001aJ\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010 J\u0012\u0010&\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b&\u0010'J|\u0010(\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\t2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b*\u0010 J\u0010\u0010+\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/J'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b:\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b<\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\b>\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\b@\u0010 R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bB\u0010\"R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\bC\u0010 R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\bD\u0010\u001aR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\bE\u0010 R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010F\u001a\u0004\bG\u0010'¨\u0006K"}, d2 = {"Ltech/chatmind/api/events/model/Popup;", "", "", "Ltech/chatmind/api/events/model/PopupAction;", "actions", "Ltech/chatmind/api/events/model/Background;", "background", "", "canClose", "", "desc", "Ltech/chatmind/api/events/model/Icon;", "icon", "title", "", "iconSize", "prompt", "Ltech/chatmind/api/events/model/PopupTracking;", "tracking", "<init>", "(Ljava/util/List;Ltech/chatmind/api/events/model/Background;ZLjava/lang/String;Ltech/chatmind/api/events/model/Icon;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ltech/chatmind/api/events/model/PopupTracking;)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/util/List;Ltech/chatmind/api/events/model/Background;ZLjava/lang/String;Ltech/chatmind/api/events/model/Icon;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ltech/chatmind/api/events/model/PopupTracking;Lxyc;)V", "component1", "()Ljava/util/List;", "component2", "()Ltech/chatmind/api/events/model/Background;", "component3", "()Z", "component4", "()Ljava/lang/String;", "component5", "()Ltech/chatmind/api/events/model/Icon;", "component6", "component7", "component8", "component9", "()Ltech/chatmind/api/events/model/PopupTracking;", "copy", "(Ljava/util/List;Ltech/chatmind/api/events/model/Background;ZLjava/lang/String;Ltech/chatmind/api/events/model/Icon;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ltech/chatmind/api/events/model/PopupTracking;)Ltech/chatmind/api/events/model/Popup;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/events/model/Popup;Lag2;Lnyc;)V", "write$Self", "Ljava/util/List;", "getActions", "Ltech/chatmind/api/events/model/Background;", "getBackground", "Z", "getCanClose", "Ljava/lang/String;", "getDesc", "Ltech/chatmind/api/events/model/Icon;", "getIcon", "getTitle", "getIconSize", "getPrompt", "Ltech/chatmind/api/events/model/PopupTracking;", "getTracking", "Companion", "sja", "tja", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class Popup {
    private static final lw7[] $childSerializers;
    public static final int $stable = 0;
    public static final tja Companion = new tja();
    private final List<PopupAction> actions;
    private final Background background;
    private final boolean canClose;
    private final String desc;
    private final Icon icon;
    private final List<Integer> iconSize;
    private final String prompt;
    private final String title;
    private final PopupTracking tracking;

    static {
        bca bcaVar = new bca(12);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{eb3.N(z18Var, bcaVar), null, null, null, null, null, eb3.N(z18Var, new bca(13)), null, null};
    }

    public /* synthetic */ Popup(int i, List list, Background background, boolean z, String str, Icon icon, String str2, List list2, String str3, PopupTracking popupTracking, xyc xycVar) {
        if (63 != (i & 63)) {
            an1.R(i, 63, sja.a.e());
            throw null;
        }
        this.actions = list;
        this.background = background;
        this.canClose = z;
        this.desc = str;
        this.icon = icon;
        this.title = str2;
        if ((i & 64) == 0) {
            this.iconSize = null;
        } else {
            this.iconSize = list2;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
            this.prompt = null;
        } else {
            this.prompt = str3;
        }
        if ((i & 256) == 0) {
            this.tracking = null;
        } else {
            this.tracking = popupTracking;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(uja.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$0() {
        return new dd0(c77.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Popup copy$default(Popup popup, List list, Background background, boolean z, String str, Icon icon, String str2, List list2, String str3, PopupTracking popupTracking, int i, Object obj) {
        if ((i & 1) != 0) {
            list = popup.actions;
        }
        if ((i & 2) != 0) {
            background = popup.background;
        }
        if ((i & 4) != 0) {
            z = popup.canClose;
        }
        if ((i & 8) != 0) {
            str = popup.desc;
        }
        if ((i & 16) != 0) {
            icon = popup.icon;
        }
        if ((i & 32) != 0) {
            str2 = popup.title;
        }
        if ((i & 64) != 0) {
            list2 = popup.iconSize;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            str3 = popup.prompt;
        }
        if ((i & 256) != 0) {
            popupTracking = popup.tracking;
        }
        String str4 = str3;
        PopupTracking popupTracking2 = popupTracking;
        String str5 = str2;
        List list3 = list2;
        Icon icon2 = icon;
        boolean z2 = z;
        return popup.copy(list, background, z2, str, icon2, str5, list3, str4, popupTracking2);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(Popup self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.p(serialDesc, 0, (xn7) lw7VarArr[0].getValue(), self.actions);
        output.p(serialDesc, 1, ls0.a, self.background);
        output.o(serialDesc, 2, self.canClose);
        output.w(serialDesc, 3, self.desc);
        output.p(serialDesc, 4, au6.a, self.icon);
        output.w(serialDesc, 5, self.title);
        if (output.g(serialDesc) || self.iconSize != null) {
            output.A(serialDesc, 6, (xn7) lw7VarArr[6].getValue(), self.iconSize);
        }
        if (output.g(serialDesc) || self.prompt != null) {
            output.A(serialDesc, 7, p4e.a, self.prompt);
        }
        if (!output.g(serialDesc) && self.tracking == null) {
            return;
        }
        output.A(serialDesc, 8, qma.a, self.tracking);
    }

    public final List<PopupAction> component1() {
        return this.actions;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Background getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getCanClose() {
        return this.canClose;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<Integer> component7() {
        return this.iconSize;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPrompt() {
        return this.prompt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final PopupTracking getTracking() {
        return this.tracking;
    }

    public final Popup copy(List<PopupAction> actions, Background background, boolean canClose, String desc, Icon icon, String title, List<Integer> iconSize, String prompt, PopupTracking tracking) {
        actions.getClass();
        background.getClass();
        desc.getClass();
        icon.getClass();
        title.getClass();
        return new Popup(actions, background, canClose, desc, icon, title, iconSize, prompt, tracking);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Popup)) {
            return false;
        }
        Popup popup = (Popup) other;
        return pa7.t(this.actions, popup.actions) && pa7.t(this.background, popup.background) && this.canClose == popup.canClose && pa7.t(this.desc, popup.desc) && pa7.t(this.icon, popup.icon) && pa7.t(this.title, popup.title) && pa7.t(this.iconSize, popup.iconSize) && pa7.t(this.prompt, popup.prompt) && pa7.t(this.tracking, popup.tracking);
    }

    public final List<PopupAction> getActions() {
        return this.actions;
    }

    public final Background getBackground() {
        return this.background;
    }

    public final boolean getCanClose() {
        return this.canClose;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final List<Integer> getIconSize() {
        return this.iconSize;
    }

    public final String getPrompt() {
        return this.prompt;
    }

    public final String getTitle() {
        return this.title;
    }

    public final PopupTracking getTracking() {
        return this.tracking;
    }

    public int hashCode() {
        int iC = ub3.c((this.icon.hashCode() + ub3.c(ub3.d((this.background.hashCode() + (this.actions.hashCode() * 31)) * 31, 31, this.canClose), 31, this.desc)) * 31, 31, this.title);
        List<Integer> list = this.iconSize;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.prompt;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        PopupTracking popupTracking = this.tracking;
        return iHashCode2 + (popupTracking != null ? popupTracking.hashCode() : 0);
    }

    public String toString() {
        return "Popup(actions=" + this.actions + ", background=" + this.background + ", canClose=" + this.canClose + ", desc=" + this.desc + ", icon=" + this.icon + ", title=" + this.title + ", iconSize=" + this.iconSize + ", prompt=" + this.prompt + ", tracking=" + this.tracking + ")";
    }

    public Popup(List<PopupAction> list, Background background, boolean z, String str, Icon icon, String str2, List<Integer> list2, String str3, PopupTracking popupTracking) {
        list.getClass();
        background.getClass();
        str.getClass();
        icon.getClass();
        str2.getClass();
        this.actions = list;
        this.background = background;
        this.canClose = z;
        this.desc = str;
        this.icon = icon;
        this.title = str2;
        this.iconSize = list2;
        this.prompt = str3;
        this.tracking = popupTracking;
    }

    public /* synthetic */ Popup(List list, Background background, boolean z, String str, Icon icon, String str2, List list2, String str3, PopupTracking popupTracking, int i, rp3 rp3Var) {
        this(list, background, z, str, icon, str2, (i & 64) != 0 ? null : list2, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? null : str3, (i & 256) != 0 ? null : popupTracking);
    }
}
