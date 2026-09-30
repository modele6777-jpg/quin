package defpackage;

import java.util.ArrayList;
import java.util.List;
import tech.chatmind.api.seasonal.model.SeasonalCard;
import tech.chatmind.api.seasonal.model.SeasonalCareerStatus;
import tech.chatmind.api.seasonal.model.SeasonalElementGuides;
import tech.chatmind.api.seasonal.model.SeasonalFollowUp;
import tech.chatmind.api.seasonal.model.SeasonalGender;
import tech.chatmind.api.seasonal.model.SeasonalLoveStatus;
import tech.chatmind.api.seasonal.model.SeasonalPosition;
import tech.chatmind.api.seasonal.model.SeasonalReading;
import tech.chatmind.api.seasonal.model.SeasonalReadingCard;
import tech.chatmind.api.seasonal.model.SeasonalReadingResponse;
import tech.chatmind.api.seasonal.model.SeasonalStatus;
import tech.chatmind.api.seasonal.model.SeasonalUserInfo;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yqc {
    public static final SolarTerm a = SolarTerm.SUMMER_SOLSTICE;
    public static final fpc b;

    static {
        SeasonalUserInfo seasonalUserInfo = new SeasonalUserInfo(SeasonalGender.FEMALE, SeasonalCareerStatus.WORKER, SeasonalLoveStatus.IN_RELATIONSHIP, "希望这个夏天事业有突破");
        SeasonalPosition seasonalPosition = SeasonalPosition.MAJOR_ARCANA;
        SeasonalReadingCard seasonalReadingCard = new SeasonalReadingCard(seasonalPosition, "太阳", 0, "太阳带来久违的明朗，努力开始被看见。放下顾虑、大方展现自己，这个季度的好运往往来自你的自信。");
        SeasonalPosition seasonalPosition2 = SeasonalPosition.WANDS;
        SeasonalReadingCard seasonalReadingCard2 = new SeasonalReadingCard(seasonalPosition2, "权杖三", 0, "行动力强劲，适合启动一个酝酿已久的计划，眼光放远不要被眼前琐事困住。");
        SeasonalPosition seasonalPosition3 = SeasonalPosition.CUPS;
        SeasonalReadingCard seasonalReadingCard3 = new SeasonalReadingCard(seasonalPosition3, "圣杯女王", 0, "圣杯女王让你格外懂得照顾情绪——先安顿好自己，再以温柔回应他人，真诚表达比猜测更有力量。");
        SeasonalPosition seasonalPosition4 = SeasonalPosition.SWORDS;
        SeasonalReadingCard seasonalReadingCard4 = new SeasonalReadingCard(seasonalPosition4, "宝剑骑士", 0, "宝剑骑士带来果断的行动力，想清楚方向就快步向前；只是别冲得太急，留一点余地给变化。");
        SeasonalPosition seasonalPosition5 = SeasonalPosition.PENTACLES;
        List listI = t72.I(seasonalReadingCard, seasonalReadingCard2, seasonalReadingCard3, seasonalReadingCard4, new SeasonalReadingCard(seasonalPosition5, "金币八", 0, "金币八是踏实打磨的季节，稳稳投入手上的事，每一份用心都会在季末换来实实在在的收获。"));
        List listI2 = t72.I(new SeasonalCard(seasonalPosition, "the_sun", 0), new SeasonalCard(seasonalPosition2, "three_of_wands", 0), new SeasonalCard(seasonalPosition3, "queen_of_cups", 0), new SeasonalCard(seasonalPosition4, "knight_of_swords", 0), new SeasonalCard(seasonalPosition5, "eight_of_pentacles", 0));
        SeasonalReading seasonalReading = new SeasonalReading(listI, "把自己活成光，季节自会回应你。", new SeasonalElementGuides("趁热打铁，迈出那一步就对了，假设换行了", "真诚表达，比猜测更有力量", "想清楚了，再快步向前", "稳稳投入，季末自有收获"));
        SeasonalStatus seasonalStatus = SeasonalStatus.READY;
        fpc fpcVarV = t4c.v(new SeasonalReadingResponse(seasonalStatus, seasonalUserInfo, listI2, seasonalReading, t72.H(new SeasonalFollowUp("这个季度适合换工作吗？", "权杖三鼓励远行与扩张，若有更能施展的舞台值得一试；但先把手上的项目收个漂亮的尾。", seasonalStatus, "2026-06-21T10:00:00Z")), null));
        fpcVarV.getClass();
        b = fpcVarV;
        List<djc> list = fpcVarV.b;
        ArrayList arrayList = new ArrayList(t72.u(list, 10));
        for (djc djcVar : list) {
            kkc kkcVar = djcVar.a;
            if (kkcVar == kkc.c) {
                qhe qheVar = djcVar.b;
                String str = djcVar.c;
                str.getClass();
                djcVar = new djc(kkcVar, qheVar, str, "感情上，圣杯女王提醒你先照顾好自己的情绪，也别让一次小小的误会发酵成心结。这个季度的人际关系像一面镜子：你越是回避，对方就越读不懂你的善意；你越是坦诚，对方反而更愿意走近。试着把「我以为你应该懂」换成「我来告诉你我的感受」，把猜测换成对话。亲密关系里，主动并不等于低头，而是一种更成熟的勇气——先伸手的人，往往也是先把关系拉回正轨的人。如果有一段关系让你反复纠结，不妨在这个夏天给它一个明确的答案：是修复、是放下、还是重新定义彼此的距离。无论选择哪一种，记得先照顾好自己的情绪，再去回应别人的期待。");
            }
            arrayList.add(djcVar);
        }
        fpcVarV.c.getClass();
    }
}
