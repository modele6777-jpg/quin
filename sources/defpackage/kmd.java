package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;
import java.io.File;
import java.util.Iterator;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kmd {
    public final Context a;

    public kmd(Context context) {
        context.getClass();
        this.a = context;
    }

    public final File a(TarotSkinIdentify tarotSkinIdentify, String str) {
        tarotSkinIdentify.getClass();
        str.getClass();
        return new File(new File(new File(this.a.getFilesDir(), "tarot-skins"), tarotSkinIdentify.getFolder()), str.concat(".webp"));
    }

    public final boolean b(TarotSkinIdentify tarotSkinIdentify) {
        tarotSkinIdentify.getClass();
        if (!tarotSkinIdentify.getRequiresDownload()) {
            return true;
        }
        lx4 entries = TarotCardType.getEntries();
        if (entries != null && entries.isEmpty()) {
            return true;
        }
        Iterator<E> it = entries.iterator();
        while (it.hasNext()) {
            if (!iec.l(a(tarotSkinIdentify, ((TarotCardType) it.next()).getCardKey()))) {
                return false;
            }
        }
        return true;
    }

    public final Object c(TarotSkinIdentify tarotSkinIdentify, String str) {
        tarotSkinIdentify.getClass();
        str.getClass();
        if (!tarotSkinIdentify.getRequiresDownload()) {
            return tec.m("file:///android_asset/tarot-card/", tarotSkinIdentify.getFolder(), "/", str, ".webp");
        }
        File fileA = a(tarotSkinIdentify, str);
        if (fileA.exists()) {
            return fileA;
        }
        return null;
    }
}
