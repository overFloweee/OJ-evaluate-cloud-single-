package com.hjw.eoj.judge.strategy;

import com.hjw.eoj.model.dto.question.JudgeCase;
import com.hjw.eoj.model.dto.questionsubmit.JudgeInfo;
import com.hjw.eoj.model.entity.Question;
import com.hjw.eoj.model.entity.QuestionSubmit;
import com.hjw.eoj.model.vo.QuestionVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.namespace.QName;
import java.util.List;

/**
 * 判题上下文
 * 用于定义判题策略中传递的参数
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JudgeContext
{

    /**
     * 运行输入
     */
    private List<String> inputList;

    /**
     * 运行输出
     */
    private List<String> outputList;


    /**
     * 运行信息
     */
    private JudgeInfo judgeInfo;

    /**
     * 判题用例
     */
    private List<JudgeCase> judgeCaseList;


    /**
     * 题目信息
     */
    private Question question;

    /**
     * 题目提交信息
     */
    private QuestionSubmit questionSubmit;


}
