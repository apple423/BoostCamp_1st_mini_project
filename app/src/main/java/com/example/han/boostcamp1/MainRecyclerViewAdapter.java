package com.example.han.boostcamp1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Han on 2017-07-04.
 */

public class MainRecyclerViewAdapter extends RecyclerView.Adapter<MainRecyclerViewAdapter.MainRecyclerViewHolder> {

    String[] textsArray = {"광진구 아이들을 위한 소셜 프로젝트 '언니오빠형누나'와 함께 할 둘째 멤버를 모집합니다^^!\n" +
            "언니오빠형누나 팀은 스마트폰 중독ㆍ아동범죄의 위협으로 밖에서 뛰어놀지 못하는 아이들에게 동네의 편한 언니오빠형누나가 되어주잔 신념으로 뭉쳤습니다!\n" +
            "매주 일요일 3시간 동안 세종대, 건대 주변 놀이터에서 아이들과 함께 놀고 보호해주는 활동이며 이를 통해 아이들이 마음놓고 즐겁게 뛰어놀 수 있도록 돕습니다.\n" +
            "언니오빠형누나 활동을 통해 우리 동네 아이들에게 동네 친구를 만들어주고 체력 향상 등과 함께 사회적ㆍ정서적 성장에도 돕고있습니다 \uD83D\uDE42\n" +
            "* 아이들을 진심으로 사랑하는 사람.\n" +
            "* 함께 사회문제를 개선해나가고 싶은 사람.\n" +
            "언니오빠형누나와 함께 하고싶은 멤버입니다.\n" +
            "현재까지 세종대생+건대생+고등학생+직장인으로 구성된 27명의 첫째 멤버가 함께하고 있어요! 광진구 아이들에게 둘째 멤버가 되어주세요 \uD83D\uDE42\n" +
            "▷ 활동 내용 : 원하는 일요일에 3시간동안 놀이터에서 아이들과 놀기 (봉사시간 지급)\n" +
            "▷ 모집 일정 : 3월 15일까지 지원서 접수 후 면접 공지 예정\n" +
            "▷ 지원 및 문의 : 하단의 랑크에 접속하셔서 지원서 작성해주시면 지원이 완료됩니다~~ 성심성의껏 써주세요! 카톡아이디 beiz134로 궁금하신점 연락주시면 친절히 답해드리겠습니다＾＾！",

            "#부산 #해운대 #바다 #노보텔 #논문 #학회 #일 #휴식 #소통",

            "#세종대학교 #세종창업캠프대회 #우수상!!\n" +
                    "\"#언니오빠형누나\" 사랑해요❤️\n" +
                    "진짜 밤낮없이 잠도 제대로 못자고 힘들었는데ㅠㅠ\n" +
                    "브레인들, 과분한 상을 받게 해줘서 고마워요\uD83D\uDE46\uD83C\uDFFC\n" +
                    "상금은 전부 \"언니오빠형누나\"에 기부ㅎㅎ#세종대학교 #세종창업캠프대회 #우수상!!\n" +
                    "\"#언니오빠형누나\" 사랑해요❤️\n" +
                    "진짜 밤낮없이 잠도 제대로 못자고 힘들었는데ㅠㅠ\n" +
                    "브레인들, 과분한 상을 받게 해줘서 고마워요\uD83D\uDE46\uD83C\uDFFC\n" +
                    "상금은 전부 \"언니오빠형누나\"에 기부ㅎㅎ#세종대학교 #세종창업캠프대회 #우수상!!\n" +
                    "\"#언니오빠형누나\" 사랑해요❤️\n" +
                    "진짜 밤낮없이 잠도 제대로 못자고 힘들었는데ㅠㅠ\n" +
                    "브레인들, 과분한 상을 받게 해줘서 고마워요\uD83D\uDE46\uD83C\uDFFC\n" +
                    "상금은 전부 \"언니오빠형누나\"에 기부ㅎㅎ"};
    String[] textsName = {"최상철","윤제준","송지윤님이 최상철님 외 2명과 함께 있습니다"};
    int[] ids = {R.drawable.sangchul,R.drawable.jaejoon,R.drawable.jiyoon};

    int[] ids_posted_picture = {R.drawable.sisbro,R.drawable.nonmoon,R.drawable.prize};

    String[] timeArray = {"2월 22일 오후9:05","6월 7일 오전10:30","4월 23일 오후3:10"};




    @Override
    public MainRecyclerViewAdapter.MainRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.main_screen_recycler;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachToParentImmediately);
        return new MainRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MainRecyclerViewAdapter.MainRecyclerViewHolder holder, int position) {

        String text = textsArray[position];
        int pictureID = ids[position];
        String textName = textsName[position];
        int postedPictureID = ids_posted_picture[position];
        String time = timeArray[position];


        holder.recycler_textView.setText(text);
        holder.picture_imageView.setImageResource(pictureID);
        holder.name_textView.setText(textName);
        holder.postedPicutre_imageView.setImageResource(postedPictureID);
        holder.time_textView.setText(time);

    }

    @Override
    public int getItemCount() {

        if(textsArray == null) return 0;
        return textsArray.length;
    }

    public class MainRecyclerViewHolder extends RecyclerView.ViewHolder {

        TextView recycler_textView;
        ImageView picture_imageView;
        TextView name_textView;
        ImageView postedPicutre_imageView;
        TextView time_textView;


        public MainRecyclerViewHolder(View itemView) {
            super(itemView);
            recycler_textView = (TextView) itemView.findViewById(R.id.main_recyclerView_textView);
            picture_imageView = (ImageView) itemView.findViewById(R.id.picture);
            name_textView = (TextView) itemView.findViewById(R.id.subscriber);
            postedPicutre_imageView = (ImageView) itemView.findViewById(R.id.posted_picture);
            time_textView = (TextView) itemView.findViewById(R.id.time);

        }

    }
}
